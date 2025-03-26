from flask import Flask, render_template

app = Flask(__name__)

@app.route("/")
def home():
    return render_template("index.html")  # This serves the HTML file

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000, debug=True)



# disable firewall using the cmd
# netsh advfirewall firewall add rule name="Flask App" dir=in action=allow protocol=TCP localport=5000
# run the python File
# open the ip in the phone but use http

