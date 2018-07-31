set names utf8;
set foreign_key_checks = 0;

drop database if exists kagiya;
create database if not exists kagiya;

use kagiya;

create table user_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) unique not null comment "ユーザーID",
password varchar(16) not null comment "パスワード",
family_name varchar(32) not null comment "姓",
first_name varchar(32) not null comment "名",
family_name_kana varchar(32) not null comment "姓かな",
first_name_kana varchar(32) not null comment "名かな",
sex tinyint not null default 0 comment "姓別",  /* 0：男性 1:女性 */
email varchar(32) not null comment "メールアドレス",
status tinyint not null default 0 comment "ステータス",  /* 0：ユーザー 1:管理者 */
logined tinyint not null default 0 comment "ログインフラグ",  /* 0：未ログイン 1：ログイン済 */
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日"
)
default charset=utf8
comment="会員情報テーブル"
;
insert into user_info values
(1,"guest","guest","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now()),
(2,"guest2","guest2","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now()),
(3,"guest3","guest3","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now()),
(4,"guest4","guest4","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now()),
(5,"guest5","guest5","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now()),
(6,"guest6","guest6","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now()),
(7,"guest7","guest7","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now()),
(8,"guest8","guest8","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now()),
(9,"guest9","guest9","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now()),
(10,"guest10","guest10","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now()),
(11,"guest11","guest11","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now()),
(12,"guest12","guest12","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now()),

(13,"admin","admin","インターノウス","管理者","いんたーのうす","かんりしゃ",0,"admin@gmail.com",1,0,now(),now()),
(14,"admin2","admin2","インターノウス","管理者","いんたーのうす","かんりしゃ",0,"admin@gmail.com",1,0,now(),now()),
(15,"admin3","admin3","インターノウス","管理者","いんたーのうす","かんりしゃ",0,"admin@gmail.com",1,0,now(),now()),
(16,"admin4","admin4","インターノウス","管理者","いんたーのうす","かんりしゃ",0,"admin@gmail.com",1,0,now(),now()),
(17,"admin5","admin5","インターノウス","管理者","いんたーのうす","かんりしゃ",0,"admin@gmail.com",1,0,now(),now()),
(18,"admin6","admin6","インターノウス","管理者","いんたーのうす","かんりしゃ",0,"admin@gmail.com",1,0,now(),now()),
(19,"admin7","admin7","インターノウス","管理者","いんたーのうす","かんりしゃ",0,"admin@gmail.com",1,0,now(),now()),
(20,"admin8","admin8","インターノウス","管理者","いんたーのうす","かんりしゃ",0,"admin@gmail.com",1,0,now(),now()),
(21,"admin9","admin9","インターノウス","管理者","いんたーのうす","かんりしゃ",0,"admin@gmail.com",1,0,now(),now()),
(22,"admin10","admin10","インターノウス","管理者","いんたーのうす","かんりしゃ",0,"admin@gmail.com",1,0,now(),now()),
(23,"admin11","admin11","インターノウス","管理者","いんたーのうす","かんりしゃ",0,"admin@gmail.com",1,0,now(),now()),
(24,"admin12","admin12","インターノウス","管理者","いんたーのうす","かんりしゃ",0,"admin@gmail.com",1,0,now(),now());

create table product_info(
id int primary key not null auto_increment comment "ID",
product_id int unique not null comment  "商品ID",
product_name varchar(100) unique not null comment "商品名",
product_name_kana varchar(100) not null comment "商品名かな",
product_description varchar(255) not null comment "商品詳細",
category_id int not null not null comment "カテゴリID",
price int comment "価格",
image_file_path varchar(100) comment "画像ファイルパス",
image_file_name varchar(50) comment "画像ファイル名",
release_date datetime not null comment "発売年月",
release_company varchar(50) comment "発売会社",
status tinyint not null default 0 comment "ステータス",
regist_date datetime not null comment "登録日",
update_date datetime comment "更新日",
foreign key(category_id) references m_category(category_id)
)
default charset=utf8
comment="商品情報テーブル"
;

insert into product_info values
( 1, 1, "なが〜く遊べる100変色", "ながーくあそべる100へんしょく", "全部で100回の変色が楽しめる花火のセットです。", 2, 1000, "./images/", "temochi01.jpg", "2018-05-07 09:39:16", "井上玩具煙火", 0, now(), now()),
( 2, 2, "なが〜く遊べるスパーク", "ながーくあそべるすぱーく", "燃焼時間にこだわった5種類の花火が入っています。", 2, 1000, "./images/", "temochi02.jpg", "2018-05-07 09:39:16", "井上玩具煙火", 0, now(), now()),
( 3, 3, "3変色すすき", "3へんしょくすすき", "白・緑・黄色と3変色する花火です。", 2, 300, "./images/", "temochi03.jpg", "2018-05-07 09:39:16", "煙火田中", 0, now(), now()),
( 4, 4, "四連線香花火", "よんれんせんこうはなび", "1ヶ所に火をつけると次々に火花が燃え移り、4連続で楽しめる台紙付きの線香花火です。", 2, 500, "./images/", "temochi04.jpg", "2018-05-07 09:39:16", "煙火田中", 0, now(), now()),
( 5, 5, "火の玉花火", "ひのたまはなび","赤玉と緑玉が連続的に飛び出します。", 2, 500, "./images/", "temochi05.jpg", "2018-06-04 13:59:16", "井上玩具煙火", 0, now(), now()),
( 6, 6, "パワフル3変化", "ぱわふる3へんげ","赤・緑・黄色と3変色し、勢いのある花火です。", 2, 500, "./images/", "temochi06.jpg", "2018-06-04 13:59:16", "葛城煙火", 0, now(), now()),
( 7, 7, "オーロラスパーク", "おーろらすぱーく","白いアルミニウムの火花が楽しめる花火です。", 2, 900, "./images/", "temochi07.jpg", "2018-06-04 13:59:16", "井上玩具煙火", 0, now(), now()),
( 8, 8, "3色極太カラースパーク", "3しょくごくぶとからーすぱーく","赤色・黄色・緑色の火花が吹き出します。", 2, 400, "./images/", "temochi08.jpg", "2018-06-04 13:59:16", "井上玩具煙火", 0, now(), now()),
( 9, 9, "たこ焼き君","たこやきくん", "子供に大人気の花火です。", 2, 400, "./images/", "temochi09.jpg", "2018-07-02 10:15:16", "煙火田中", 0, now(), now()),
( 10, 10, "おみくじ花火","おみくじはなび", "火花の色で運勢を占うことのできるおみくじ式スパークです。", 2, 700, "./images/", "temochi10.jpg", "2018-07-02 10:15:16", "井上玩具煙火", 0, now(), now()),
( 11, 11, "満開牡丹","まんかいぼたん", "昔ながらの線香花火です。", 2, 400, "./images/", "temochi11.jpg", "2018-07-02 10:15:16", "煙火田中", 0, now(), now()),
( 12, 12, "極太線香スパーク", "ごくぶとせんこうすぱーく","金色の鮮やかな火花が勢いよくでます。",2, 3200,"./images/","temochi12.jpg", "2018-07-02 10:15:16","煙火田中",0,now(),now()),
( 13, 13, "うちあげ職人", "うちあげしょくにん","無数の明るい赤色の星が大きく広がります。", 3, 1200, "./images/", "uchiage01.jpg", "2018-05-07 09:39:16", "尺玉屋", 0, now(), now()),
( 14, 14, "天馬","てんま", "緑小星が約15ｍ打ち上がり、内筒が約25ｍ打ち上がります。その後上空で内筒から錦の星が広がります。",3,200,"./images/","uchiage02.jpg", "2018-05-07 09:39:16", "尺玉屋", 0, now(), now()),
( 15, 15, "変幻自在", "へんげんじざい","約30m打ち上がり、ピンク色の色星を出します。", 3, 2200, "./images/", "uchiage03.jpg", "2018-05-07 09:39:16", "尺玉屋", 0, now(), now()),
( 16, 16, "華紋","かもん", "白い小星軍が約20m打ち上がった後、赤と緑の大輪を咲かせ、金菊の小玉が数個開きます。", 3, 1800, "./images/", "uchiage04.jpg", "2018-05-07 09:39:16", "尺玉屋", 0, now(), now()),
( 17, 17, "黄色椰子", "きいろやし","上空で大きく開花し、赤から黄に変化してキラキラ点滅しながら長く垂れます。", 3, 1300, "./images/", "uchiage05.jpg", "2018-06-04 13:59:16", "尺玉屋", 0, now(), now()),
( 18, 18, "エメラルド彗星", "えめらるどすいせい","エメラルドの大きな星が約25mの高さまで昇り竜のように打ち上がります。", 3, 1700, "./images/","uchiage06.jpg", "2018-06-04 13:59:16", "尺玉屋", 0, now(), now()),
( 19, 19, "すいか", "すいか","すいかを連想させるような赤とキラキラ光る星の打ち上げ花火です。", 3, 1100, "./images/", "uchiage07.jpg", "2018-06-04 13:59:16", "尺玉屋", 0, now(), now()),
( 20, 20, "碧", "あお","エメラルドグリーンの牡丹の大輪を咲かせます。", 3, 1300, "./images/", "uchiage08.jpg", "2018-06-04 13:59:16", "尺玉屋", 0, now(), now()),
( 21, 21, "桃", "もも","桃色の牡丹の大輪を咲かせます。", 3, 1300, "./images/", "uchiage09.jpg", "2018-07-02 10:15:16", "尺玉屋", 0, now(), now()),
( 22, 22, "天空のシャンデリア", "てんくうのしゃんでりあ","約20m打ち上がり、白・赤・緑の光が広がります。", 3, 1600, "./images/", "uchiage10.jpg", "2018-07-02 10:15:16", "稲垣屋", 0, now(), now()),
( 23, 23, "飛び魚", "とびうお","稲妻の様な光が四方八方に走ります。", 3, 1200, "./images/", "uchiage11.jpg", "2018-07-02 10:15:16", "稲垣屋", 0, now(), now()),
( 24, 24, "回", "まわる","赤色と銀色の点滅する星が瞬いた後、花が舞い散るようにくるくる回りながら落ちてきます。", 3, 1200, "./images/", "uchiage12.jpg", "2018-07-02 10:15:16", "尺玉屋", 0, now(), now()),
( 25, 25, "花火職人1", "はなびしょくにん1", "入社２年目の新米。みんなの喜ぶ顔が見たいという熱い想いで入社。笑顔の子どもを見ることが幸せ。", 4, 5000, "./images/", "syokunin1.jpg", "2016-05-02 10:15:16", "火技屋", 0, now(), now()),
( 26, 26, "花火職人2", "はなびしょくにん2", "入社２年目の新米。今だに打ち上げ花火の爆発音に慣れない。", 4, 5000, "./images/", "syokunin2.jpg", "2016-05-02 10:15:16", "火技屋", 0, now(), now()),
( 27, 27, "花火職人3", "はなびしょくにん3", "入社２年目の新米。入社２年目の中のムードメーカー。花火の前後はお祭り会場にいるかも・・・。", 4, 5000, "./images/", "syokunin3.jpg", "2016-05-02 10:15:16", "火技屋", 0, now(), now()),
( 28, 28, "花火職人4", "はなびしょくにん4", "入社２年目の新米。新米の中では一番腕がいい。導火線を追いかけてしまう癖がある。", 4, 5000, "./images/", "syokunin4.jpg", "2016-06-02 10:15:16", "火技屋", 0, now(), now()),
( 29, 29, "花火職人5", "はなびしょくにん5", "入社７年目の中堅。祭りと聞けば全国どこにでも駆けつけるお祭り男。花火職人の腕は・・・。", 4, 6500, "./images/", "syokunin5.jpg", "2011-06-02 10:15:16", "火技屋", 0, now(), now()),
( 30, 30, "花火職人6", "はなびしょくにん6", "入社５年目の中堅。花火のこととなれば人一倍熱くなる。ハートの花火を始めて打ち上げた。", 4, 5000, "./images/", "syokunin6.jpg", "2013-06-02 10:15:16", "火技屋", 0, now(), now()),
( 31, 31, "花火職人7", "はなびしょくにん7", "入社１０年目のベテラン。安全第一をモットーに働いている。", 4, 7000, "./images/", "syokunin7.jpg", "2008-06-02 10:15:16", "火技屋", 0, now(), now()),
( 32, 32, "花火職人8", "はなびしょくにん8", "入社１０年目のベテラン。お調子者。", 4, 7000, "./images/", "syokunin8.jpg", "2008-06-02 10:15:16", "火技屋", 0, now(), now()),
( 33, 33, "花火職人9", "はなびしょくにん9", "入社３０年の大ベテラン。見た目は怖いが中身も怖い。花火に対する情熱は日本で１番。", 4, 10000, "./images/", "syokunin9.jpg", "1988-03-02 10:15:16", "火技屋", 0, now(), now()),
( 34, 34, "花火職人10", "はなびしょくにん10" ,"入社４０年の社長。従業員には厳しいが、子供には優しい。花火を語らせると夏が終わる。",  4, 10000, "./images/", "syokunin10.jpg", "1978-03-02 10:15:16", "火技屋", 0, now(), now());


create table cart_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
temp_user_id varchar(16) comment "仮ユーザーID",
product_id int not null comment "商品ID",
product_count int not null comment "個数",
price int not null comment "金額",
regist_date datetime not null comment "登録日",
update_date datetime comment "更新日"
)
default charset=utf8
comment="カート情報テーブル"
;

create table purchase_history_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
product_id int not null comment "商品ID",
product_count int not null comment "個数",
price int not null comment "金額",
destination_id int not null comment "宛先情報ID",
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日",
product_name varchar(100) not null comment "商品名",
product_name_kana varchar(100) not null comment "商品名かな",
image_file_path varchar(100) comment "画像ファイルパス",
image_file_name varchar(50) comment "画像ファイル名",
release_date varchar(100) not null comment "発売年月",
release_company varchar(50) comment "発売会社",
foreign key(user_id) references user_info(user_id)
)
default charset=utf8
comment="購入履歴情報テーブル"
;

create table destination_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
family_name varchar(32) not null comment "姓",
first_name varchar(32) not null comment "名",
family_name_kana varchar(32) not null comment "姓かな",
first_name_kana varchar(32) not null comment "名かな",
email varchar(32) not null comment "メールアドレス",
tel_number varchar(13) not null comment "電話番号",
user_address varchar(50) not null comment "住所",
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日"
)
default charset=utf8
comment="宛先情報テーブル"
;
insert into destination_info values
(1,"guest","インターノウス","テストユーざー","いんたーのうす","てすとゆーざー","guest@internous.co.jp","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),"0000-00-00 00:00:00");

create table m_category(
id int primary key not null comment "ID",
category_id int not null unique comment "カテゴリID",
category_name varchar(20) not null unique comment "カテゴリ名",
category_description varchar(100) comment "カテゴリ詳細",
insert_date datetime not null comment "登録日",
update_date datetime comment "更新日"
)
default charset=utf8
comment="カテゴリマスタテーブル"
;
insert into m_category values
(1,1,"全てのカテゴリー","手持ち花火、打ち上げ花火、花火職人の全てのカテゴリーが対象となります",now(), null),
(2,2,"手持ち花火","手持ち花火に関するカテゴリーが対象となります",now(),null),
(3,3,"打ち上げ花火","打ち上げ花火に関するカテゴリーが対象となります",now(),null),
(4,4,"花火職人","花火職人に関するカテゴリーが対象となります",now(),null);
