var chartDataStr = decodeHTML(chartData)
var chartDataArr = JSON.parse(chartDataStr)

var arrLen = chartDataArr.length
var numericData = []
var labelData =[]

for(var i=0;i<arrLen;i++){
	numericData[i]=chartDataArr[i].value
	labelData[i]=chartDataArr[i].label
}


var ctx = document.getElementById('myChart').getContext('2d');
var chart = new Chart(ctx, {
    // The type of chart we want to create
    type: 'pie',

    // The data for our dataset
    data: {
        labels: labelData,
        datasets: [{
            label: 'My First dataset',
            backgroundColor: ["#1824b6", "#e56b7c", "#86a440", "#ef3fa3", "#ddee28"],
        
            data: numericData
        }]
    },

    // Configuration options go here
    options: {
		title: {
			display: true,
			text: "Project Statuses"
		}
}
});

function decodeHTML(html){
	var txt = document.createElement("textarea")
	txt.innerHTML=html
	return txt.value
}
