<html>
<body>

    <form method="get" action="http://localhost:8080/hello_world">
        <p><b><h3>Input you word/words</h3></b></p>
        <label>
            <input placeholder="name"; type="text" name="name">
        </label>
        <p><input type="submit" value="Let's go!"></p>
    </form>

    <p><b><h3>View calendar for current day</h3></b></p>
    <form method="get" action="http://localhost:8080/calendar">
            <p><input type="submit" value="Let's go!"></p>
     </form>


    <form method="get" action="http://localhost:8080/calendar">
      <p><b><h2>Change information for custom calendar:</h2></b></p>

      <h3>Select:</h3>
      <h4>Day/Month/Year</h4>
      <select name="day">
               <% for(int i = 1; i <=31; i+=1) { %>
                      <option value%=i%><%=i%></option>
                  <% } %>

      </select>

      <select name="month">
        <option value="1">January</option>
        <option value="2">February</option>
        <option value="3">March</option>
        <option value="4">April</option>
        <option value="5">May</option>
        <option value="6">June</option>
        <option value="7">July</option>
        <option value="8">August</option>
        <option value="9">September</option>
        <option value="10">October</option>
        <option value="11">November</option>
        <option value="12">December</option>
      </select>


        <select name="year">
                       <% for(int i = 0001; i <=4032; i+=1) { %>
                              <option value%=i%><%=i%></option>
                          <% } %>

              </select>

        <br>
      <h4>Select first day of week</h4>
      <select name="dayOfWeek">
              <option value="1">Monday</option>
              <option value="2">Tuesday</option>
              <option value="3">Wednesday</option>
              <option value="4">Thursday</option>
              <option value="5">Friday</option>
              <option value="6">Saturday</option>
              <option value="7">Sunday</option>
      </select>
      </br>
      <h4>Change weekends</h4>
        <input type="checkbox" checked="true" name="weekends" value="1">Monday</input>
        <input type="checkbox" name="weekends" value="2">Tuesday</input>
        <input type="checkbox" name="weekends" value="3">Wednesday</input>
        <input type="checkbox" name="weekends" value="4">Thursday</input>
        <input type="checkbox" name="weekends" value="5">Friday</input>
        <input type="checkbox" name="weekends" value="6">Saturday</input>
        <input type="checkbox" name="weekends" value="7">Sunday</input>
      <p><input type="submit"value="Let's go!"></p>
     </form>


</body>
</html>
