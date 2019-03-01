var express = require('express');

var app = express();

app.get('/', function(req, res){
  res.sendFile(__dirname + '/COMP1536Lab4.html');
});

app.use('/CSS', express.static('CSS'));

app.listen(3000);
