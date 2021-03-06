<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet" />
<meta charset="UTF-8">
<title>Cotador N�utico</title>
</head>
<body style="background: #f4f4f4; font-family: Arial; font-size: 12px;">


	<div class="container-fluid">

		<div class="row">
			<form action="publicacoes" th:action="@{/publicacoes}"
				th:object="${publicacoes}" method="post">
				<div class="col-xs-12 margin-top-20">
					<div class="row" style="margin-top: 20px">
						<div class="col-xs-12 col-xs-offset-5">
							<b style="text-align: center; font-size: 150%">Consulta
								Publicacao</b>
						</div>
					</div>
				</div>
				<br />
				<div style="width: 1043px; margin: auto; margin-top: 50px;">
					<div class="panel panel-default">
						<div class="panel-body">
							<div class="col-xs-12"></div>
							<div class="row" id="topoFiltro" style="cursor: pointer;">
								<div class="col-xs-11">
									<b>FILTRO</b>
								</div>
							</div>
							<hr style="margin-top: 10px; border: 1px dotted #CCC;">
							<div class="row">
								<div class="col-xs-6">
									Nome do Titulo: <input type="text" class="form-control"
										name="titulo"
										style="width: 100%; height: 34px; padding: 6px 6px; font-size: 12px; float: left">
								</div>
								<div class="col-xs-6" style="margin-top: 16px;">
									<button type="submit" class="btn btn-primary" id="btnConsultar">Consultar</button>
								</div>
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>


		<div style="width: 1043px; margin: auto; margin-top: 50px;">
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="col-xs-12">
						<br />
						<div class="row" id="topoFiltro" style="cursor: pointer;">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Id</th>
										<th>Titulo</th>
										<th>Pagina Inicial</th>
										<th>Pagina Final</th>
										<th>Data Publicacao</th>
									</tr>
								</thead>
								<tr>
									<td><span>${publicacao.id}</span></td>
									<td><span>${publicacao.titulo}</span></td>
									<td><span>${publicacao.pagInicial}</span></td>
									<td><span>${publicacao.pagFinal}</span></td>
									<td><span>${publicacao.dataPublicacao}</span></td>
								</tr>
							</table>
						</div>
					</div>
					<div class="col-xs-12 col-xs-offset-10">
						<a href="/PublicacaoConsumer/" class="btn btn-primary">Voltar</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js "></script>
</body>
</html>