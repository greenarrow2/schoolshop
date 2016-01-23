function ChangeRegion(obj,type,ids,boxid){
    var NewHtml = "<option value='0'>请选择</option>";
    if(boxid){
        var ch = new Array; 
        ch = boxid.split(","); 
        if(ch){
            for(i=0;i<ch.length;i++){
                $("#"+ch[i]).find('option').remove();
            }
        }
    }
    if(type==0){
        for(n=0;n<country.length;n++){
            NewHtml+="<option value='"+country[n].id+"'>"+country[n].name+"</option>";
        }
        $("#"+ids).find('option').remove();
        $(NewHtml).appendTo($("#"+ids));
    }
     if(type==1){
        for(n=0;n<province.length;n++){
            if(obj.val() == province[n].parent && obj.val()>0){
                NewHtml+="<option value='"+province[n].id+"'>"+province[n].name+"</option>";
            }
        }
       $("#"+ids).find('option').remove();
       $("#"+ids).show();
       $(NewHtml).appendTo($("#"+ids));
    }
    if(type==2){
        for(n=0;n<allRegion.length;n++){
            if(obj.val() == allRegion[n].parent && obj.val()>0){
                NewHtml+="<option value='"+allRegion[n].id+"'>"+allRegion[n].name+"</option>";
            }
        }
       $("#"+ids).find('option').remove();
       $("#"+ids).show();
       $(NewHtml).appendTo($("#"+ids));
    }
    if(type==3){
        for(n=0;n<allRegion.length;n++){
            if(obj.val() == allRegion[n].parent && obj.val()>0){
                NewHtml+="<option value='"+allRegion[n].id+"'>"+allRegion[n].name+"</option>";
            }
        }
       $("#"+ids).find('option').remove();
       $("#"+ids).show();
       $(NewHtml).appendTo($("#"+ids));
    }
}
/**
 * 用户地址库地址体检检测
 * @param {type} obj
 * @returns {Boolean}
 */
function CheckAddress(obj){
    var CountryObj = obj.find(":input[name='UserAddress[Country]']");
    var ProvinceObj = obj.find(":input[name='UserAddress[Province]']");
    var CityObj = obj.find(":input[name='UserAddress[City]']");
    var DistrictObj = obj.find(":input[name='UserAddress[District]']");
    var MobileObj = obj.find(":input[name='UserAddress[Mobile]']");
    var ConsigneeObj = obj.find(":input[name='UserAddress[Consignee]']");
    var AddressObj = obj.find(":input[name='UserAddress[Address]']");
    if(CountryObj.val()<=0){
        alert("请选择国家");
        return false;
    }
    if(ProvinceObj.val()<=0){
        alert("请选择省份");
        return false;
    }
    if(CityObj.val()<=0){
        alert("请选择城市");
        return false;
    }
    if(DistrictObj.val()<=0){
        alert("请选择地区");
        return false;
    }
    if(ConsigneeObj.val()==''){
        alert("请填写收货人");
        return false;
    }
    if(AddressObj.val()==''){
        alert("请填写地址");
        return false;
    }
    if(MobileObj.val()==''){
        alert("请填写手机");
        return false;
    }
    return true;
}