<html>
<body>
<h2>
    <form method="get" action="http://localhost:8080/hello_world">
        <p><b>input you word</b></p>
        <label>
            <input placeholder="name"; type="text" name="name">
        </label>
        <p><input type="submit" value="Let's go!"></p>
    </form>
    <form method="get" action="http://localhost:8080/calendar">
      <p><b>change information for calendar</b></p>

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

      <input placeholder="year=1111"; type="text"name="year" >

      <select name="dayOfWeek">
              <option value="1">Monday</option>
              <option value="2">Tuesday</option>
              <option value="3">Wednesday</option>
              <option value="4">Thursday</option>
              <option value="5">Friday</option>
              <option value="6">Saturday</option>
              <option value="7">Sunday</option>
      </select>
      <input placeholder="weekends=6,7"; type="text"name="weekends">
      <p><input type="submit"value="Let's go!"></p>
     </form>

</h2>
</body>
</html>
