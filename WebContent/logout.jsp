<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="../lib/js/jquery.min.js"></script>
    <script type="text/javascript" src="../lib/js/bootstrap.min.js"></script>
    <link href="lib/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="lib/css/bootstrap.css" rel="stylesheet" type="text/css">
    <link href="lib/css/padrao.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src = "lib/js/verificador_cpf.js"></script>
</head>
<body>
<div class="section section-danger text-justify">
      <div class="container">
        <div class="row text-center">
          <div class="col-md-12 text-center">
            <h1 class="text-center">Logout</h1>
          </div>
        </div>
      </div>
    </div>
    <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <form class="form-horizontal" role="form" type="submit" method = "post"  id = "form" name = "form">
				<div class="form-group">
                <div class="col-sm-2">
                  <label for="inputEmail3" class="control-label">Deseja realmente sair da aplicação</label>
                </div>
                <div class="col-sm-10">
                   <a href="login.jsp" class="btn btn-default">Fazer Logout</a>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
    <footer>
      <div class="navbar navbar-fixed-bottom bgred">
        <div class="container">
          <div class="row">
            <div class="col-sm-12 text-center" style="top:13px;color:#fff;">© Molindo</div>
          </div>
        </div>
      </div>
    </footer>
</body>      
</html>