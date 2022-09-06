var path = document.location.pathname;
var tab = undefined;
if (path === "/"){
    tab = document.querySelector("#nav-homepage");
} else if (path.indexOf("/faq/") === 0){
    tab = document.querySelector("#nav-faq");
} else if (path.indexOf("/lessons/") === 0){
    tab = document.querySelector("#nav-lessons");
} else if (path.indexOf("/pages/") === 0) {
    tab = document.querySelector("#nav-sandbox");
} else if (path.indexOf("/login/") === 0) {
    tab = document.querySelector("#nav-login");
}
tab.classList.add("active")
        
