

function getListLabo(code_lab)
{
    var reponse;
    $.ajax({
        url:"../formation?type=consult3&function=getListlabo&code_lab="+code_lab,
        type:'POST',
        async:false,
        dataType:"json",
        error:function(jqXHR,textStatus,errorTrown)
        {
            
        },
        success:function(data,textStatus,jqXHR)
        {
            reponse=data;
        }
    });
    return reponse;
}

function getListanalyse()
{
    var reponse;
    $.ajax({
        url:"../formation?type=consult2&function=getListanalyse",
        type:'POST',
        async:false,
        dataType:"json",
        error:function(jqXHR,textStatus,errorTrown)
        {
            
        },
        success:function(data,textStatus,jqXHR)
        {
            reponse = data;
        }
    });
    return reponse;
}

function remplir_Labo(data)
{
    var select_html="<select id='select_Labo'>";
    $.each(data,function(i)
    {
        select_html +="<option value ='"+data[i].codeLab+"'>"+data[i].nomLab+"</option>";
    });
    select_html +="<option value ='all'>ALL</option>";
    select_html += "</select>"; 
    $('#div_select_Labo').html(select_html).trigger('create');
    $("#select_Labo").select2({

    dropdown: $('#MyModalanalyse').modal('show')
});

}

 function DessinerMedecin(data,element)
 {
     var code_HTML="<table>";
     for(var i=0;i<data.length;i++)
     {
         code_HTML +="<tr>";
         code_HTML +="<td>"+data[i].num;
          code_HTML +="</td>";
         code_HTML +="<td>"+data[i].nom;
         code_HTML +="</td>";
         code_HTML +="</tr>";
         
     }
     code_HTML +="</table>";
     $("#"+element).html(code_HTML).trigger("create");  
 }
 
 
 
    