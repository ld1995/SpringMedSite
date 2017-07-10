$(document).ready( function () {
    var table = $('#employeesTable').DataTable({
        "sAjaxSource": "/patients",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "aoColumns": [
            { "mData": "id"},
            { "mData": "name" },
            { "mData": "lastName" },
            { "mData": "email" },
            { "mData": "phone" },
            { "mData": "active" }
        ]
    })
});
