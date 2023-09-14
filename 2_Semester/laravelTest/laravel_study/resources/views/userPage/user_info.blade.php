<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>

<body>
    @if (count($user) == 0)
        <h2> 사용자를 찾을 수 없습니다. </h2>
    @else
        <h2> 사용자 상세 정보</h2>
        <div style="width:800px;  position:relative;">
            <div style="border: 3px black solid; padding:10px; width:auto; margin-bottom:30px">
                {{-- 1 --}}
                <h2>이름 : <span style="color: blue">{{ $user['name'] }}</span> </h2>

                {{-- 2 --}}
                <h2>email :{{ $user['email'] }} </h2>

                {{-- 3 --}}
                <h2> 생년월일 :{{ $user['birthDate'] }}</h2>

            </div>

            <div style="right: 5px; position: absolute;; display:inline-block;">
                <input type="submit" value="삭제버튼">
                &nbsp;&nbsp;
                <a href="/users/{{ $user['id'] }}/edit">
                    <input type="submit" value="수정버튼">
                </a>
            </div>
        </div>
    @endif
</body>

</html>
