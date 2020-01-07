function nextConsulta(faseSig){   
    var faseActual = document.forms.formi.pfase.value;
    var url = window.location.href.split('?')[0]
    var url2 = window.location.href;
    if(faseActual=="11"){
        if(document.getElementsByName("fecha").length > 1){
            for (let i = 0; i < document.getElementsByName("fecha").length; i++) {
                
                if(document.getElementsByName("fecha")[i].checked==true){
                    document.forms.formi.elements.pfase.value = faseSig;
                    return true;
                }
                
            }
            return false;

        }else{
            if(formi.fecha.checked == true){   
                formi.elements.pfase.value = faseSig;
                return true;
            }else{

                return false;
            }
        }
        
    }else if(faseActual="12"){
       nodes =document.getElementsByName("pcanal");
       if(nodes.length == 1){
            if(document.forms.formi.elements.pcanal.checked == true){
                document.forms.formi.elements.pfase.value = faseSig;
                return true;
            }else{
                document.forms.formi.elements.pfase.value = faseActual;
                return false;
            }
        }else{
            for(i = 0 ; i < document.getElementsByName("pcanal").length ; i++){
                if(document.getElementsByName("pcanal")[i].checked == true){
                    document.forms.formi.elements.pfase.value = faseSig;
                    return true;
                }
            }
            document.forms.formi.elements.pfase.value = faseActual;
            return false;
        } 
        
    }
        

}
function goBack(value){
   
        if(document.forms.formi.pfase.value=="12"){
            formi.pfase.value = value;
            formi.fecha.name = "";  
        }else if(document.forms.formi.pfase.value=="11") {
           formi.pfase.value = value;
        }else if(document.forms.formi.pfase.value=="13"){
            formi.pfase.value = value;
            
        }

   
    //window.history.back();
}
function nextPage(){
    
}