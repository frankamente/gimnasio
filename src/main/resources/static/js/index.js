$('document').ready(function () {


    $(".send").click(function () {
        $.ajax({
            contentType: "application/json",
            method: "POST",
            url: "/index",
            data: JSON.stringify({
                name: $(".name").val(),
                lastName: $(".lastName").val()
            }),
            success: function () {
                alert("success");
            },
            error: function () {
                alert("error");
            }
        });
    });


});