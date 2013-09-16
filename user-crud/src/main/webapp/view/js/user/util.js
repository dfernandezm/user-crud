(function() {
	
	// could be in another JS file, just to create namespace in window global object
	var userMgr = window.UserMgr = {};
	
	// we create everything under UserMgr namespace in order to avoid using global window all the time
	var util = UserMgr.util = {
	
	someVariable: "",
	someVariable2: 0,
	
	functionDoSomething: function() {
		
	},
	
	fooFunction: function() {
		
	}
	 			
 };
  
})();