<!DOCTYPE HTML>
<html>
<head>
<title>Spring Boot 2.5.4 WebSockets Using Stomp and sock</title>
</head>

<body>
	<br />
	<br /> Welcome to Spring Boot Websockets using Stomp and Sock
	<br />
	<br />
	<br />
	<input id="text" type="text" />
	<button onclick="send()">Send</button>
	<button onclick="closeWebSocket()">Close</button>
	<br />
	<br />
	<div id="message"></div>
</body>
<script>
	var serverName = '${serverName}'
</script>
<script type="text/javascript">
	var websocket = null;

	//current brower support WebSocket or not
	if ('WebSocket' in window) {
		websocket = new WebSocket("ws://" + serverName + "/websocket");
	} else {
		alert('Not support websocket')
	}

	//callback when connect on error
	websocket.onerror = function() {
		setMessageInnerHTML("error");
	};

	//callback when connect success
	websocket.onopen = function(event) {
		setMessageInnerHTML("open");
	}

	//callback when receive message
	websocket.onmessage = function(event) {
		setMessageInnerHTML(event.data);
	}

	//callback when connect close
	websocket.onclose = function() {
		setMessageInnerHTML("close");
	}

	//listening window close event. when this window closed,to force close websocket,avoid the window not closing before the websocket closed.
	window.onbeforeunload = function() {
		websocket.close();
	}

	//Message show on the webpage
	function setMessageInnerHTML(innerHTML) {
		document.getElementById('message').innerHTML += innerHTML + '<br/>';
	}

	//close connect
	function closeWebSocket() {
		websocket.close();
	}

	//send message
	function send() {
		var message = document.getElementById('text').value;
		websocket.send(message);
	}
</script>
</html>
