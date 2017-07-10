$(document).ready( function () {
    var table = $('#patientTable').DataTable({
        "sAjaxSource": "/patients",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "aoColumns": [
            { "mData": "id"},
            { "mData": "wards" },
            { "mData": "number" },
            { "mData": "date" },
            { "mData": "last" },
            { "mData": "first" },
            { "mData": "second" }
        ]
    })
});
