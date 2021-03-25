<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<%@page import="exavalu.com.beans.User"%>
<!DOCTYPE html>
<html>

    <head>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Exavalu Insurance Application</title>
        <meta name="robots" content="noindex, nofollow">
        <link rel="stylesheet" href="css/homepage_css.css">

        <script type="text/javascript">
            window.history.forward();
            function noBack()
            {
                window.onbeforeunload = function () {
                    return "Your work will be lost.";
                };
            }
        </script>
    </head>
    <body onLoad="noBack();" onpageshow="if (event.persisted) noBack();" onUnload="">
        <div class="bg-image" style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/Others/images/76.jpg'); height: 100vh">
        <%
            User user = (User) request.getSession().getAttribute("user");
//            if(user==null)
//            {
//                RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
//                rd.forward(request, response);
//            }
%> 
<header> 
   <div id = "intro" class="view hm-black-strong">
        <div class="full-big-img">
<!--            <a href="#" title="Background"><img alt="Background" src="images/insurance-industry.png" style="position: fixed; left: 0; top: 0" width="100%" height="auto"></a>-->
        </div>
    </div>
</header>
<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>Ajax Test
    </title>
    <script type="text/javascript">

    function showImage(){
        document.getElementById('loadingImage').style.visibility='visible';
    }

    

    function hideImage(){
        document.getElementById('loadingImage').style.visibility='hidden';
    }

    

    </script>
    </head>
<body>
    <input type="button" value="click" onclick="showImage();"/>
    <img id="loadingImage" src="images/template.jpg" style="visibility:hidden"/>
    <input type="button" value="click" onclick="hideImage();"/>
    <img id="loadingImage" src="images/template.jpg" style="visibility:hidden"/>
     
</body>
    
    </button>
</html>

<header id="header">

            <div class="logo">
                <a href="www.exavalu.com/" rel="home" title="Exavalu Home Page" title="Homepage"><img alt="Exavalu" src="images/logo.png"><strong>Exavalu<span> Insurance</span></strong></a>
            </div>
            <div class="navigate">
                <ul>
               <li><a href="#" >Welcome: <%=user.getUserName()%></a></li>
<!--                    <li><a href="#" >Welcome: <c:out value = "${login_credentials.userName}"></a></li>-->
                    <li><a href="Policy.jsp" title="Policies"><img alt="Policies" src="images/policy.png" height="50" width="50"></a></li>
                    <li>
                        <a href="#" title="Customers"><img alt="Customers" src="images/customers.jpg" height="50" width="50"></a>
                    </li>
                    <li><a href="Logout" title="Log Out" target="_top"><img alt="Policies" src="images/logout.jpg" height="50" width="50"></a>
                    </li>
                </ul>
            </div> 
                  
                   <form name="myForm" id="myForm" onsubmit="return validateForm()">
    Enter Policy: <br />
    <input type="text" id="policy" />
    <input type="button" id="addpolicy" value="+" />
    <br/>
</form>

<script>
document.getElementById("addpolicy").onclick = function() {
    var form = document.getElementById("myForm");
    var input = document.createElement("input");
    input.type = "text";
    var br = document.createElement("br");
    form.appendChild(input);
    form.appendChild(br);
}
</script>
                       
</header>
        </div>                
    </body>
 </html>
</html>
