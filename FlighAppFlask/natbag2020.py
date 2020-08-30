#!/usr/bin/python
import subprocess

import app
from flask import Flask, request, render_template
from werkzeug.utils import redirect

app = Flask("my_app", template_folder="Templates")

@app.route("/natbag")
def natbag():
    return render_template("mainPage.html")

@app.route("/addTakingOffFlight", methods =[ "POST","GET"])
def addtakinfoffflight():
    if request.method =="GET":
             return render_template("addtake.html")
    else :
        company = request.form["com"]
        destination = request.form["des"]
        time = request.form["time"]
        date = request.form["date"]
        subprocess.check_output(["java", "-classpath", "C:/Users/User/Documents/GitHub/FlighWithUs/FlightApp2/bin",
                                       "Program", str(5),company,destination,time ,date])
        return render_template("fileCreatedSucc.html")

@app.route("/addLandingFlight", methods =[ "POST","GET"])
def addLanding():
    if request.method == "GET":
        return render_template("addLanding.html")
    else :
        company = request.form["com"]
        takingofffrom = request.form ["take"]
        time = request.form["time"]
        date = request.form["date"]
        subprocess.check_output(
        ["java", "-classpath", "C:/Users/User/Documents/GitHub/FlighWithUs/FlightApp2/bin", "Program", str(4),company,takingofffrom,time,date])
        return render_template("fileCreatedSucc.html")

@app.route("/showLandingFlight")
def showLandings():
    with open("landingsDisplayHtml.txt", "r") as text_file:
        text_file_to_display = text_file.read()
    return render_template("showLandings.html", text_file_to_display=text_file_to_display)

@app.route("/showTakeOfFlight")
def showTakeOff():
    with open("takeOffDisplayHtml.txt", "r") as text_file:
        text_file_to_display = text_file.read()
    return render_template("showTakingOffFlight.html", text_file_to_display=text_file_to_display)

@app.route("/findFlight" , methods = ["POST", "GET"])
def findFlight():
  if request.method =="GET" :
      return render_template("findFlight.html")

  else :
        company = request.form["com"]
        takesOffFrom = request.form ["take"]
        destination = request.form["des"]
        time = request.form["time"]
        date = request.form["date"]

        subprocess.check_output(
        ["java", "-classpath", "C:/Users/User/Documents/GitHub/FlighWithUs/FlightApp2/bin", "Program", str(10),company,takesOffFrom,destination,time ,date])
        with open("FlightsThatHaveBeenFound.txt", "r") as text_file:
            text_file_to_display = text_file.read()
        return render_template("flightsThatHaveBeenFound.html",text_file_to_display=text_file_to_display)


@app.route("/eyal")
def eyal():
    return subprocess.check_output(["java", "-classpath" , "C:/Users/User/Desktop/ProjectTestEyal/Eyal/bin" , "EyalPro"])
app.run(port=8000, host="0.0.0.0")