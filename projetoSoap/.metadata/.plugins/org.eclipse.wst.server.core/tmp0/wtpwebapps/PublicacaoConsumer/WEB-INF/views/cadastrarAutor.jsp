<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet" />
<meta charset="UTF-8">
<script type="text/javascript">
	function buscarEndereco() {
	//	document.getElementById("endereco").value = '';
	//	document.buscarEnd.action = 'buscaEndereco';
	//	document.buscarEnd.submit;
	}
	
</script>

<title>Cadastro de Publica��o</title>
</head>
<body style="background: #f4f4f4; font-family: Arial; font-size: 12px;">


	<div style="width: 1043px; margin: auto">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="col-xs-12"></div>
				<div class="row" id="topoFiltro" style="cursor: pointer;">
					<div class="col-xs-11">
						<b>Formul�rio de Cadastro de Autor</b>
					</div>
				</div>
				<hr style="margin-top: 10px; border: 1px dotted #CCC;">
				 <c:if test="${incluir eq 1}">
					<div class="alert alert-success">
						<strong>Sucesso!</strong> Autor inclu�do com sucesso.
					</div>
				</c:if>
				 <c:if test="${cpfValido}">
					<div class="alert alert-success">
						<strong>Sucesso!</strong> CPF � v�lido.
					</div>
				</c:if>
				<c:if test="${cpfInvalido}">
					<div class="alert alert-info">
						<strong>Aten��o!</strong> CPF n�o � v�lido.
					</div>
				</c:if>
				<div class="col-xs-12">
					<form action="addAutor" th:action="@{/addAutor}"
						th:object="${autor}" method="post" name="addAutor"> 
					<div class="col-xs-12">
						<div class="row">
							<div class="col-xs-2">
								N�mero Cpf: <span style="color: red">*</span> <input
									type="number" class="form-control" name="cpf" size="11"
									value="${autor.cpf}">
							</div>
							<div style="margin-top: 17px;" class="col-xs-2">
									<button class="btn btn-primary" style="width: 133px;" type="submit" onclick="buscarEndereco()"
										id="validarCpf">validar CPF</button>
							</div>
							<div class="col-xs-4">
								Nome: <span style="color: red">*</span> <input type="text"
									class="form-control" name="nome" value="${autor.nome}">
							</div>
							<div class="col-xs-4">
								Nome Cita��o : <span style="color: red">*</span> <input
									type="text" class="form-control" name="nomeCitacao"
									value="${autor.nomeCitacao}">
							</div>
						</div>
						<br />
						<div class="row">
							<div class="col-xs-4">
								Cep: <span style="color: red">*</span> <input type="number"
									id="cep" class="form-control" name="endereco.cep" size="8"
									value="${autor.endereco.cep}">
							</div>
								<div style="margin-top: 17px;" class="col-xs-2">
									<button class="btn btn-primary"  type="submit" value="buscarEndereco" name="endereco.endereco"  onclick="buscarEndereco()"
										id="btnConsultarEnd">Buscar Endere�o</button>
								</div>
							<div class="col-xs-6">
								Endere�o <span style="color: red">*</span> <input type="text" id="endereco"
									class="form-control" name="endereco.endereco"
									value="${autor.endereco.endereco}">
							</div>
						</div>
						<br />
						<div class="row">
							<div class="col-xs-4">
								Bairro : <span style="color: red">*</span> <input type="text"
									class="form-control" name="endereco.bairro"
									value="${autor.endereco.bairro}">
							</div>
							<div class="col-xs-4">
								Cidade: <span style="color: red">*</span> <input type="text"
									class="form-control" name="endereco.cidade"
									value="${autor.endereco.cidade}">
							</div>
							<div class="col-xs-4">
								UF : <span style="color: red">*</span> <input type="text"
									class="form-control" name="endereco.uf"
									value="${autor.endereco.uf}">
							</div>
						</div>
						<br /> <br />
						<div class="row">
							<div class="col-xs-2 col-xs-offset-8">
								<button class="btn btn-primary" onclick="enviarAutor()" id="btnConsultar">Incluir</button>
							</div>
							<div class="col-xs-1">
								<a href="/PublicacaoConsumer/" class="btn btn-primary">Voltar</a>
							</div>
						</div>
					</div>
					</form>
				</div>
				<br />
			</div>
		</div>
	</div>


</body>
</html>