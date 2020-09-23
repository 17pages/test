<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>RPA</title>
</head>
<script src="https://kit.fontawesome.com/825f57de13.js" crossorigin="anonymous"></script>
<style type="text/css">
	body{
		margin: 0;
		padding: 0;
	}

div.wrap {
	width: 600px;
	height: auto;
	margin: 0px;
	padding: 0px;
	border: 1px solid;
}

div.header_wrap{
	display: block;
	width: 100%;
	height: auto;
	border: 1px ;
}

div.header{
	font-size: 20px;
	font-weight:  bold;
	text-align: center;
}

div.option_choice{
	margin-top: 5px;

}

div.content_wrap{
	width: 100%
	margin:0;
	padding: 0;
}

div.content_in_wrap{
	position: relative;
	width: 100%;
	height:auto;

}
div.content_in{
	padding: 30px 30px;
	background-color: #eee;

}

div.start_button_wrap{
	text-align: center;

}
div.start_button{
	display: inline-block;
}

div.notice{
padding-top : 5px;
}
</style>
<body>

	<div class="wrap">
		<div class="header_wrap">
			<div class="header">RPA</div>
		</div>

		<div class="content_wrap">
			<form name="" action="upload" method="post" class="" id="form1" enctype="multipart/form-data" target="repacetFrame">
			<div class="content_in_wrap">
				<div class="content_in">
					<div>[fasta 파일]</div>
					<div class="put_file">
						<input type="file" name="file1" id="fasta_file" multiple="multiple">
					</div>
					<div class="option_choice">
						<table>
							<tbody>
								<tr>
									<td>
										<div>[parameters 파일]</div>
										<div class="put_file">
											<input type="file" name="parameters_file" id="parameters_file">
										</div>
										<div class="notice">※주의사항※</div>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="start_button_wrap">
						<div class="start_button">
							<input type="reset" name="" value="Reset">
							<input type="submit" name="" value="Start">
						</div>
					</div>
				</div>
			</div>
			</form>
		</div>
	</div>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
var result = '${savedName}';
parent.addFilepath(result);


</script>


</html>