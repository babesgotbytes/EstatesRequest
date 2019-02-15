<%-- 
    Document   : student
    Created on : Feb 5, 2019, 12:53:30 PM
    Author     : CLARICE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <title>Student</title>
    </head>
    <body>
        <!--<h1>Hello World!</h1>-->
     <form  id="appication-form" action="report" method="POST">

        <div class="row">
            <div class="form-group col-md-4">
                <label for="Category-select">Choose a Category:</label>

                <select id="Category-select"  class="form-control" name="cate">
                    <option value="" disabled selected>--Please choose--</option>
                    <option value="hostel">Hostel</option>
                    <option value="lecture hall">Lecture Hall</option>
                    <option value="office">Offices</option>
                    <option value="games sector">Games Sector</option>
                    <option value="anycategory">Any Other</option>

                </select><br>

            </div>

<!--            <div class="form-group col-md-4" id="department_div" style="display: none">-->
<!--                <label for="Category-select">Choose a Category:</label>-->
<!---->
<!--                <select id="option_2"  class="form-control"  required>-->
<!--                    <option value="" disabled selected>--Please choose--</option>-->
<!---->
<!---->
<!--                </select><br><br>-->
<!---->
<!--            </div>-->

        </div>

        <div class="row">

            <div class="form-group col-md-4">

                <label for="Category-select">CategoryName:</label>
                <input type="text" class="form-control" name="categoryname" autocomplete="off" required>

<!--                <select id="Type-select"  class="form-control">-->
<!--                    <option value="">--Please choose--</option>-->
<!--                    <option value="building">Building</option>-->
<!--                    <option value="tap">Tap</option>-->
<!--                    <option value="pipe">Pipe</option>-->
<!--                    <option value="washroom">WashRoom</option>-->
<!--                    <option value="bulb">Bulb</option>-->
<!--                    <option value="anytype">Any Other</option>-->
<!---->
<!--                </select><br><br>-->
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-4">
                <label for="Category-select">PropertyName:</label>
                <input type="text" class="form-control"  name="propertyname" autocomplete="off" required>

            </div>
        </div>
        <div class="row">

            <div class="form-group col-md-4">

                <label for="Category-select">Choose the Kind of Damage:</label>

                <select id="Damage-select" class="form-control" name="damage">
                    <option value="" disabled selected>--Please choose--</option>
                    <option value="broken">Broken</option>
                    <option value="stolen">Stolen</option>
                    <option value="blocked">Blocked</option>
                    <option value="burnt">Burnt</option>
                    <option value="leaking">Leaking</option>
                    <option value="repair">Repair</option>
                    <option value="replace">Replace</option>
                    <option value="paint">Paint</option>
                    <option value="spoilt">Spoilt</option>
                    <option value="cracked">Cracked</option>

                </select><br><br>
            </div>
        </div>
        <div class="row">

            <div class="form-group col-md-4">


                <button type="submit" class="btn " name="submit" value="Submit" style="margin-top: 25px;background-color: #0056b3; color:white; width: 100px;margin-left: 100px;"> Submit</button>


            </div>
        </div>

</div>
    </form>
        
    </body>
     <script src="js/bootstrap.min.js"></script>
</html>

