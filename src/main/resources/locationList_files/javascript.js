//filtre les espaces dans une chaine de caractères
function trim(str) {
	return str.replace(/(^\s*)|(\s*$)/g,"");
}

function changeCouleur(ligne, ma_couleur){
	ligne.bgColor = ma_couleur;
}

function remetCouleur(ligne, ma_couleur){
	ligne.bgColor = ma_couleur;
}

//ouvre une popup
function MM_openBrWindow(theURL, winName, features)
{
	window.open(theURL, winName, features);
}

//ouvre une popup centrée
function MM_openBrWindow2(theURL,winName, largeur, hauteur, features)
{
	var largeurEcran = (screen.width - largeur) / 2;
	var hauteurEcran = (screen.height - hauteur) / 2;
	window.open(theURL,winName,'top=' + hauteurEcran + ',left=' + largeurEcran + ',width=' + largeur + ',height=' + hauteur + ',' + features);
}

function bookmarksite(){
	if (document.all){
		window.external.AddFavorite(location.href, document.title);
	}else if(window.sidebar){
		window.sidebar.addPanel(document.title, location.href, "");
	}
}