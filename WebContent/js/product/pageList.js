function page(id,start,limit){
	$.post('../../front/product/getTwoTypeProduct.htm',{start:start,limit:limit,id:id},function (result){
		$('#product').empty();
		$('#product').html(result);
	},'html')
}
function oneTypePage(id,start,limit){
	$.post('../../front/product/getOneTypeProduct.htm',{start:start,limit:limit,id:id},function (result){
		$('#product').empty();
		$('#product').html(result);
	},'html')
}

