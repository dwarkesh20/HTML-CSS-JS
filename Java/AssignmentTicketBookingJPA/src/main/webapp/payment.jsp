<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payment</title>
</head>
<body>
    <div>
        <h2>Payment</h2>
        <form action="payment" method="post">
            <table>
            	<tr>
                    <td><input type="text" value="${t.ticketID}" name="tid" hidden>
                    	<input type="text" value="${t.seatType}" name="seattype" hidden>
                    </td>
                </tr>
                <tr>
                    <th> <label for="">Payment Type</label></th>
                    <td>
                        <select name="paymenttype">
                            <option value="cash">Cash</option>
                            <option value="card">Card</option>
                            <option value="upi">UPI</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th><label for="">Transaction Type: </label></th>
                    <td><input type="text" name="transactionid"></td>
                </tr>
                <tr>
                <th></th>
                    <td><input type="submit" value="Book Now"></td>
                </tr>
            </table>
           

        </form>
    </div>
</body>
</html>