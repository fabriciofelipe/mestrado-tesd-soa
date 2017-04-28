<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet" />
<meta charset="UTF-8">
<title>Exclusao Publica��o</title>
</head>
<body style="background: #f4f4f4; font-family: Arial; font-size: 12px;">



	<div class="row">
		<form action="excluirPublicacao" th:action="@{/excluirPublicacao}"
				th:object="${publicacoes}" method="post">
			<div class="col-xs-12 margin-top-20">
				<div class="row" style="margin-top: 20px">
					<div class="col-xs-12 col-xs-offset-5">
						<b style="text-align: center; font-size: 150%">Excluir
							Publicac�o</b>
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
	
	<div style="width: 1043px; margin: auto">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="col-xs-12"></div>
				<div class="row" id="topoFiltro" style="cursor: pointer;">
					<div class="col-xs-11">
						<b>Exclus�o de Publica��o</b>
					</div>
				</div>

				<hr style="margin-top: 10px; border: 1px dotted #CCC;">
				 <c:if test="${excluir eq 1}">
					<div class="alert alert-success">
						<strong>Sucesso!</strong> Publica��o exclu�da com sucesso.
					</div>
				</c:if>
				<div class="col-xs-12">
				<form action="excPublicacao" th:action="@{/excPublicacao}" th:object="${publicacoes}" method="post">
						<input type="hidden" name="id" value="${publicacao.id}"
							style="width: 100%; height: 34px; padding: 6px 6px; font-size: 12px;">
						<div class="col-xs-12">
							<div class="row">
								<div class="col-xs-12">
									Nome T�tulo: <span style="color: red">*</span> <input
										type="text" class="form-control" name="titulo"
										value="${publicacao.titulo}"
										style="width: 100%; height: 34px; padding: 6px 6px; font-size: 12px;">
								</div>
							</div>
							<br />
							<div class="row">
								<div class="col-xs-4">
									Pagina Inicial: <span style="color: red">*</span> <input
										type="text" class="form-control" name="pagInicial"
										value="${publicacao.pagInicial}"
										style="width: 100%; height: 34px; padding: 6px 6px; font-size: 12px;">
								</div>
								<div class="col-xs-4">
									Pagina Final: <span style="color: red">*</span> <input
										type="text" class="form-control" name="pagFinal"
										value="${publicacao.pagFinal}"
										style="width: 100%; height: 34px; padding: 6px 6px; font-size: 12px;">
								</div>
								<div class="col-xs-4">
									Data Publica��o: <span style="color: red">*</span> <input
										type="text" class="form-control" name="dataConverter"
										value="${publicacao.dataPublicacao}"
										style="width: 100%; height: 34px; padding: 6px 6px; font-size: 12px;">
								</div>
							</div>
							<br />
							<br />
							<div class="row">
								<div class="col-xs-2 col-xs-offset-8">
									<button type="submit" class="btn btn-primary" id="btnConsultar">Excluir</button>
								</div>
								<div class="col-xs-1">
									<a href="/PublicacaoConsumer/" class="btn btn-primary">Voltar</a>
								</div>
							</div>
						</div>
				</div>
				<br />
				</form>
			</div>
		</div>
	</div>
	</div>


</body>
</html>