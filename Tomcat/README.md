### view tomcat gui
```
<role rolename="manager-gui"/>
  <role rolename="manager-script"/>
  <role rolename="manager-jmx"/>
  <role rolename="manager-status"/>
  <role rolename="admin-gui"/>
  <user username="tomcat" password="tomcat" roles="manager-gui, manager-script, manager-jmx, manager-status, admin-gui"/>
```
### context path for this project 
```
 <Context path="/shopieasy" docBase="shopieasy.war" />

```

