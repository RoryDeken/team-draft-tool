
//randomDraftOrder();

let order = document.getElementById("draft-order");
let teamList = document.getElementById("teams");
order.innerHTML = '';
teamList.innerHTML = '';

for(i = 0; i < managers.length; i++){
	var manager = document.createElement('li');
	var t = document.createTextNode(managers[i].owner);
	manager.append(t);
	if(managers[i].team != ''){
		var teamImage = document.createElement('img');
		teamImage.classList.add('team');
		teamImage.src = "assets/img/" + managers[i].team + '.png';
		manager.appendChild(teamImage);
		teams.find(function(item, index){
			if(item){
				if(managers[i].team == item.abrev){
					teams.splice(index,1);
				}
			}
		});
	}
	order.append(manager);
}

for(i = 0; i < teams.length; i++){
	var team = document.createElement('li');
	var t = document.createTextNode(teams[i].name);
	team.append(t);
	var teamImage = document.createElement('img');
	teamImage.classList.add('team');
	teamImage.src = "assets/img/" + teams[i].abrev + '.png';
	team.appendChild(teamImage);
	teamList.append(team);
}

function randomDraftOrder(){
	randoms = managers.sort(func);
	return randoms;
}
function func(a, b) {
  return 0.5 - Math.random();
}
