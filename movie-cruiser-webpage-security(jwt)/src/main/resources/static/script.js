// let userName = document.forms["login-submit"]["username"].value;
// document.getElementById("user-name").innerHTML = userName;
function loginValidate() {
    let user = document.forms["login-submit"]["username"];
    let pass = document.forms["login-submit"]["password"];
    
    let errormssg = document.getElementById("login-error");

    if(user.value == 'Naveen' && pass.value == 'password'){
        document.forms["login-submit"].action = "movie-list-customer";
        return true;
    }
    errormssg.style.display = "block";
    return false;
}
function adminLoginValidate() {
    let user = document.forms["login-submit"]["username"];
    let pass = document.forms["login-submit"]["password"];
    
    let errormssg = document.getElementById("login-error");

    if(user.value == 'Admin' && pass.value == 'password'){
        document.forms["login-submit"].action = "movie-list-admin";
        return true;
    }
    errormssg.style.display = "block";
    return false;
}

function addCart() {
    alert("Please Login First");
}
function addCartCustomer() {
    let mssg = document.getElementById("added-message");
    mssg.style.display = "block";
    return true;
}
function editValidate() {
    let successMessage = document.getElementById("successful-message");
    let hideDiv = document.getElementById("edit-container");
    let item = document.forms["edit-form"]["item"];
    let itemError = document.getElementById("item-error");

    let price = document.forms["edit-form"]["price"];
    let priceError = document.getElementById("price-error");

    let dol = document.forms["edit-form"]["date-of-launch"];
    let dolError = document.getElementById("dol-error");

    let category = document.forms["edit-form"]["category"];
    let categoryError = document.getElementById("category-error");

    // let status = document.forms["edit-form"]["status"];
    // let statusError = document.getElementById("status-error");

    if(item.value == '') {
        itemError.style.display = "block";
        return false;
    }
    if(price.value == '') {
        priceError.style.display = "block";
        return false;
    }
    if(dol.value == '') {
        dolError.style.display = "block";
        return false;
    }
    if(category.value == '') {
        categoryError.style.display = "block";
        return false;
    }
    // if(status.checked) {
    //     statusError.style.display = "block";
    // }
    hideDiv.style.display = "none";
    successMessage.style.display = "block";
    return false;    
    

}