
/* global Backbone, columnsListLaboGlobal, Backgrid, focusableRowLaboGlobal */

var pageableGridListLaboGlobal;
$(function () {

  
    var data_Labo = getListLabo();
    remplir_Labo(data_Labo);

    //grid des medecin
                var LaboGlobal = Backbone.Model.extend({});
                var ListLaboGlobal = Backbone.PageableCollection.extend({
                model: LaboGlobal,
                        url: "../formation?type=consult2&function=getListanalyse",
                        mode: "client" ,
                });
                var _ListLaboGlobal = new ListLaboGlobal();
                var columnsListLaboGlobal =
        [
    {
                name: "code",
                label: "code",
                cell: Backgrid.StringCell.extend({
                ClassName: 'String-Cell-2',
                })

        }
        ,
        {
                name: "exam",
                label: "designation",
                cell: Backgrid.StringCell.extend({
                ClassName: 'String-Cell-3',
                 
                })

        }
        
        ];
                var focusableRowLaboGlobal = Backgrid.Row.extend({
                highlightColor :'BAD2E4',
//                        events :{
//                                 Click:'Click',
//                                doubletap:'rowDblClick',
//                                dbclick:'rowDbclick',
//                                tap:'Click'
//                        },
                        });
                        
                        
                      pageableGridListLaboGlobal = createBackgrid(pageableGridListLaboGlobal, "_gridanalyse", columnsListLaboGlobal, _ListLaboGlobal, true, focusableRowLaboGlobal);
                        _ListLaboGlobal.fetch ({
                        
                        });
                        $('#MyModalanalyse').modal('show');




});

        