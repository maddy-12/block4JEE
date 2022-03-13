<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inscription</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
<div class="container form-zone my-5">
		<div class="text-center">
			<h1>S'inscrire</h1>
		</div>	

					
		<form>
			 <div class="row">
			 	<label for="exampleInputEmail1" class="form-label">Type d'incident</label>
			    <div class="col-6">
			      	<div class="mb-3 form-check">
                    	<input type="checkbox" class="form-check-input" id="exampleCheck1">
                   		<label class="form-check-label" for="exampleCheck1">Check me out</label>
               		</div>
  				</div>
		
  				<div class="col-6">
			      	<div class="mb-3 form-check">
                    	<input type="checkbox" class="form-check-input" id="exampleCheck1">
                   		<label class="form-check-label" for="exampleCheck1">Check me out</label>
               		</div>
  				</div>
			 </div>

			
  			<div class="mb-3">
    			<label for="exampleInputEmail1" class="form-label">Lieu de l'incident</label>
    			<input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="textHelp">
  			</div>
  			 <div class="mb-3">
    			<label for="exampleInputEmail1" class="form-label">Latitude</label>
    			<input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="textHelp">
  			</div>
  			 <div class="mb-3">
    			<label for="exampleInputEmail1" class="form-label">Longitude</label>
    			<input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="textHelp">
  			</div>
            <div class="d-flex justify-content-center">
            	<button type="submit" style="width:200px;"class="btn btn-primary">Valider</button>
            </div>
  			
		</form>

		<style>
			.form-zone{
			width: 60%;
			padding:20px;
			border: #F4F3F6 1px solid;
			box-shadow: -6px 15px 15px -12px rgba(0,0,0,0.32);
			}
		</style>
	</div>	
</body>
</html>