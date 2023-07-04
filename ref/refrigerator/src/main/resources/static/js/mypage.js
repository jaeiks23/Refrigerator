function toggle_menu(){
    const submenu = document.getElementById("myMenu");
    if(submenu.style.display == 'none'){
        submenu.style.display = 'block';
    }
    else{
        submenu.style.display = 'none';
    }
};


	function bannedAndDelete(t){
		var member = $('.'+t+'member').text();
		var title = $('.'+t+'title').attr('value');
		var content = $('.'+t+'notifiedContent').attr('value');
		var notifiedMember = $('.'+t+'notifiedMember').text();
		var notifiedCase = $('.'+t+'notifiedCase').text();
		var notifiedReason = $('.'+t+'notifiedReason').text();
		var writingId = $('.'+t+'writingId').text();
		var commentId = $('.'+t+'commentId').text();
		var boardId = $('.'+t+'boardId').text();
		console.log(writingId);
	
		window.open('','checkNotified',"toolbar=no,directories=no,scrollbars=no,resizable=no,status=no,menubar=no,width=500, height=500, top=0,left=20")
		$('#member').val(member);
		$('#notifiedMember').val(notifiedMember);
		$('#title').val(title);
		$('#content').val(content);
		$('#notifiedCase').val(notifiedCase);
		$('#notifiedReason').val(notifiedReason);
		$('#writingId').val(writingId);
		$('#commentId').val(commentId);
		$('#boardId').val(boardId);
		$('#notifying').submit();
		
	}
