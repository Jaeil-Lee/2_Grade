<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

// php artisan make:controller  UserController --resource 로 생성하면 이렇게 클래스안에 7개의 메소드가 자동으로 생성된다. 


class UserController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        /* 
           1. DB에서 사용자 정보를 가져온다🚩
           2. 가져온 사용자 정보를 blade 파일에 넘겨 주면서 실행한다   
        */

        $users = [
                    ['id'=>1,'name'=>'이상열','birthDate'=>'1967/08/09','email'=>'hansung@naver.com'],
                    ['id'=>2,'name'=>'박은영','birthDate'=>'1969/01/19','email'=>'tbvjdnajs007@naver.com'],
                    ['id'=>3,'name'=>'이재일','birthDate'=>'1994/10/01','email'=>'lji941001@naver.com'],
                    ['id'=>4,'name'=>'이재성','birthDate'=>'1996/12/01','email'=>'ljs7068@naver.com'],
                    ['id'=>6,'name'=>'사야카','birthDate'=>'1997/12/06','email'=>'sayaka1001@yahoo.com']
                 ]; //DB에서 읽어온 정보를 $users 변수에 할당했다고 가정 

        return view('welcome',
            [
                'users'=>$users
            ]
        );

    }

    /**
     * Show the form for creating a new resource.  새로운 리소스를 생성하기 위한 form을 보여준다.
     */
    public function create()
    {
        return view('/registerPage/register_form');
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        /* 
            1. 🚩Request 객체로 부터 사용자가 form에 입력한 값을 꺼낸다 
            2. 1에서 꺼낸 값을 DB에 넣는다.  ( 나중에 ) 
            3. 🚩등록결과 페이지를 만들어서 반환한다.  
        */ 

        $name = $request-> input("name");
        $birthday = $request-> input("birthday");
        $email = $request-> input("email");
        $affiliation = $request-> input("affiliation");

        return view('/registerPage/register',
            [
                'name'=>$name,
                'birthday'=>$birthday,
                'email'=>$email,
                'affiliation'=>$affiliation,
            ]
        );
    }

    /**
     * Display the specified resource.  상세 냐용 보이게 
     */
    public function show(string $id)
    {
        /* 
            1. id를 가지고 DB에서 레코드 하나를 인출 
            2. 인출된 그 정보를 변수 $user에 할당 
            3. 그 $user 값을 blade에 전달하면서 실행.
        */
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(string $id)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, string $id)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        //
    }
}
