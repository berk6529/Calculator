<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" > 
</head>

<body>
 <div class="row">
  <div class="col-md-offset-2 col-md-8">
    <div class="panel panel-primary">
    
      <div class="panel-heading text-center">
        <h1>Calculator</h1>
      </div>
      
      <div class="panel-body">
      
        <form action="/Calculator/result" method="post">
	        <div id="leftSide" class="panel panel-info col-sm-6">
	            <div class="panel-heading text-center">
	                <h4>First Number</h4>
	            </div>
	            <div class="panel-body text-center">
	                 <div class="form-group">
      					<input type="text" class="form-control" name="leftNum">
   					 </div>
	            </div>
	        </div>
	        
	        <div id="rightSide" class="panel panel-info col-sm-6">
	            <div class="panel-heading text-center ">
	                <h4>Second Number</h4>
	            </div>
	            <div class="panel-body text-center">
	                 <div class="form-group">
      					<input type="text" class="form-control" name="rightNum">
   					 </div>
	            </div>
	        </div>
	        
	       <div id="operationCol" class="panel panel-info col-sm-12">
	       
	         <div class="panel-heading text-center">
	            <h4>Operation</h4>
	          </div>
	          
	          <div class="panel-body text-center">
		          <p>
		        	<select name="options">
		  				<option value="add">add</option>
		  				<option value="subtract">subtract</option>
		  				<option value="divide">divide</option>
		  				<option value="multiply">multiply</option>
					</select>
			      </p>
	          </div>
	          
		    </div>
		    
		    <div class="body text-center">
		      <input type="submit" class="btn btn-primary" value="calculate"/>
		    </div>
		    
		</form>
      </div>
     </div>
   </div>
 </div>
</body>
</html>