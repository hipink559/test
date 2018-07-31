package com.internousdev.kagiya.util;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils
;
public class InputChecker {


	/*
	 * 入力された内容が正しい表記かどうかチェックするためのもの。
	 *
	 * doCheck(入力したい値の名前, 入力したい値, 最小値, 最大値, 半角英字, 漢字, ひらがな, 半角数字, 半角記号, カタカナ, 全角記号)
	 * に引数を渡す。結果はList形式で渡される。
	 *
	 * 例＞メールアドレスを調べたい場合
	 * doCheck("メールアドレス", email, 14, 32, true, false, false, true, true, false, false)
	 */


	public List<String> doCheck(String propertyName, String value, int minLength, int maxLength,
			boolean availableAlphabeticCharacters, boolean availableKanji, boolean availableHiragana, boolean availableHalfWidthDigit,
			boolean availableHalfWidthSymbols, boolean availableKatakana, boolean availableFullWidthSymbols){

				//検証した結果を入れるList
				List<String> stringList = new ArrayList<String>();
				//入力した文字型を入れるList
				List<String> characterTypeList = new ArrayList<String>();

				if(minLength != 0) {
					//入力されているか(空欄かどうか)チェック
					if(StringUtils.isEmpty(value)){
						stringList.add(propertyName + "を入力してください");
					}
				}

				//入力文字数(最小文字数以上、最大文字数以下かどうか)をチェック
				if(value.length() < minLength || value.length() > maxLength){
					stringList.add(propertyName + "は" + minLength + "文字以上" + maxLength + "文字以下で入力してください");
				}


				//入力された文字のタイプから何を判別するか決める
				String regularExpression = "";
				String errorExpression = "";


				if(availableAlphabeticCharacters || availableKanji || availableHiragana || availableHalfWidthDigit ||
						availableHalfWidthSymbols||availableKatakana||availableFullWidthSymbols){
					regularExpression = "[^";
				}
				if(!(availableAlphabeticCharacters) || !(availableKanji) || !(availableHiragana) || !(availableHalfWidthDigit) ||
						!(availableHalfWidthSymbols)|| !(availableKatakana)|| !(availableFullWidthSymbols)){
					errorExpression = "[^";
				}

				if(availableAlphabeticCharacters){
					regularExpression +="a-zA-Z";
						characterTypeList.add("半角英字");
				}else{
					errorExpression += "a-zA-Z";
				}

				if(availableKanji){
					regularExpression +="一-鉞";
					characterTypeList.add("漢字");
				}else{
					errorExpression +="一-鉞";
				}

				if(availableHiragana){
					regularExpression +="ぁ-ん";
					characterTypeList.add("ひらがな");
				}else{
					errorExpression +="ぁ-ん";
				}

				if(availableHalfWidthDigit){
					regularExpression +="0-9";
					characterTypeList.add("半角数字");
				}else{
					errorExpression+="0-9";
				}

				if(availableHalfWidthSymbols){
					regularExpression +="\\[\\]<>@.,;:!#$%&'*+-/=?^_`{|}~ ";
					characterTypeList.add("半角記号");
				}else{
					errorExpression +="\\[\\]<>@.,;:!#$%&'*+-/=?^_`{|}~ ";
				}

				if(availableKatakana){
					regularExpression +="ァ-ヺ";
					characterTypeList.add("カタカナ");
				}else{
					errorExpression +="ァ-ヺ";
				}

				if(availableFullWidthSymbols){
					regularExpression +="￥ー、＜。＞・「」’＠．，；：！＃＄％＆’＊＋―／＝？＾＿｀｛｜｝～　０-９ａ-ｚＡ-Ｚ";
					characterTypeList.add("全角記号");
				}else{
					errorExpression +="￥ー、＜。＞・「」’＠．，；：！＃＄％＆’＊＋―／＝？＾＿｀｛｜｝～　０-９ａ-ｚＡ-Ｚ";
				}

				if(!StringUtils.isEmpty(regularExpression)){
					regularExpression +="]+";
				}
				if(!StringUtils.isEmpty(errorExpression)){
					errorExpression +="]+";
				}


				//判別した項目に応じてエラーメッセージを返す
				String characterType = "";
				for(int i = 0;i < characterTypeList.size();i++){
					if(i == 0){
						characterType += characterTypeList.get(i).toString();
					}else{
						characterType += "、" + characterTypeList.get(i).toString();
					}
				}
				if(errorExpression.equals("")){
					if(value.matches(regularExpression)){
						stringList.add(propertyName + "は" + characterType + "で入力してください");
					}
				}else{
					if(value.matches(regularExpression)||(!value.matches(errorExpression)&&!value.equals(""))){
						stringList.add(propertyName + "は" + characterType + "で入力してください");
					}
				}

				return stringList;
			}

	public List<String> doCheckSearch(String propertyName, String value, int minLength, int maxLength,
			boolean availableAlphabeticCharacters, boolean availableKanji, boolean availableHiragana, boolean availableHalfWidthDigit,
			boolean availableHalfWidthSymbols, boolean availableKatakana, boolean availableFullWidthSymbols){

				//検証した結果を入れるList
				List<String> stringList = new ArrayList<String>();
				//入力した文字型を入れるList
				List<String> characterTypeList = new ArrayList<String>();

				if(minLength != 0) {
					//入力されているか(空欄かどうか)チェック
					if(StringUtils.isEmpty(value)){
						stringList.add(propertyName + "を入力してください");
					}
				}

				//入力文字数(最小文字数以上、最大文字数以下かどうか)をチェック
				if(value.length() < minLength || value.length() > maxLength){
					stringList.add(propertyName + "は" + minLength + "文字以上" + maxLength + "文字以下で入力してください");
				}


				//入力された文字のタイプから何を判別するか決める
				String regularExpression = "";
				String errorExpression = "";


				if(availableAlphabeticCharacters || availableKanji || availableHiragana || availableHalfWidthDigit ||
						availableHalfWidthSymbols||availableKatakana||availableFullWidthSymbols){
					regularExpression = "[^";
				}
				if(!(availableAlphabeticCharacters) || !(availableKanji) || !(availableHiragana) || !(availableHalfWidthDigit) ||
						!(availableHalfWidthSymbols)|| !(availableKatakana)|| !(availableFullWidthSymbols)){
					errorExpression = "[^";
				}

				if(availableAlphabeticCharacters){
					regularExpression +="a-zA-Z";
						characterTypeList.add("半角英字");
				}else{
					errorExpression += "a-zA-Z";
				}

				if(availableKanji){
					regularExpression +="一-鉞";
					characterTypeList.add("漢字");
				}else{
					errorExpression +="一-鉞";
				}

				if(availableHiragana){
					regularExpression +="ぁ-ん";
					characterTypeList.add("ひらがな");
				}else{
					errorExpression +="ぁ-ん";
				}

				if(availableHalfWidthDigit){
					regularExpression +="0-9";
					characterTypeList.add("半角数字");
				}else{
					errorExpression+="0-9";
				}

				if(availableHalfWidthSymbols){
					regularExpression +="\\[\\]<>@.,;:!#$%&'*+-/=?^_`{|}~";
					characterTypeList.add("半角記号");
				}else{
					errorExpression +="\\[\\]<>@.,;:!#$%&'*+-/=?^_`{|}~";
				}

				if(availableKatakana){
					regularExpression +="ァ-ヺ";
					characterTypeList.add("カタカナ");
				}else{
					errorExpression +="ァ-ヺ";
				}

				if(availableFullWidthSymbols){
					regularExpression +="￥ー、＜。＞・「」’＠．，；：！＃＄％＆’＊＋―／＝？＾＿｀｛｜｝～";
					characterTypeList.add("全角記号");
				}else{
					errorExpression +="￥ー、＜。＞・「」’＠．，；：！＃＄％＆’＊＋―／＝？＾＿｀｛｜｝～";
				}

				if(!StringUtils.isEmpty(regularExpression)){
					regularExpression +="]+";
				}
				if(!StringUtils.isEmpty(errorExpression)){
					errorExpression +="]+";
				}


				//判別した項目に応じてエラーメッセージを返す
				String characterType = "";
				for(int i = 0;i < characterTypeList.size();i++){
					if(i == 0){
						characterType += characterTypeList.get(i).toString();
					}else{
						characterType += "、" + characterTypeList.get(i).toString();
					}
				}
				if(errorExpression.equals("")){
					if(value.matches(regularExpression)){
						stringList.add(propertyName + "は" + characterType + "で入力してください");
					}
				}else{
					if(value.matches(regularExpression)||(!value.matches(errorExpression)&&!value.equals(""))){
						stringList.add(propertyName + "は" + characterType + "で入力してください");
					}
				}

				return stringList;
			}


	//入力パスワードと確認パスワードが一致しているか検証する
	public List<String> doPasswordCheck(String password,String reConfirmationPassword){
		List<String> stringList = new ArrayList<String>();
		if(!(password.equals(reConfirmationPassword))){
			stringList.add("入力されたパスワードが異なります");
		}
		return stringList;
	}

	/*管理者商品ID*/
	public static String productIdChk(String productId) {
		String result = null;

		if(productId.isEmpty()) {
			result = "商品IDを入力してください";
		}
		if(productId.length()<1 || productId.length()>4) {
			result = "商品IDは1文字以上4文字以下で入力してください";
		}
		if(!productId.matches("^[0-9]+$")) {
			result = "商品IDは半角数字で入力してください";
		}
		return result;
	}

	/*管理者商品名*/
	public static String productNameChk(String productName) {
		String result = null;

		if(productName.isEmpty()) {
			return result = "商品名を入力してください";
		}
		if(productName.length()<1 || productName.length()>20) {
			result ="商品名は1文字以上20文字以下で入力してください";
		}
		if(!productName.matches("[ぁ-ゞーァ-ヺー一-龠ー0-9ーa-zA-Z]+$")) {
			result = "商品名はひらがな、漢字、半角数字、半角英字で入力してください";
		}

		return result;
	}

	/*管理者商品名かな*/
	public static String productNameKanaChk(String productNameKana) {
		String result = null;

		if(productNameKana.isEmpty()) {
			result = "商品名の仮名を入力してください";
		}
		if(productNameKana.length()<1 || productNameKana.length()>20) {
			result ="商品名仮名は1文字以上20文字以下で入力してください";
		}
		if(!productNameKana.matches("^[ぁ-ゞー]+$")) {
			result = "商品名の仮名はひらがなで入力してください";
		}
		return result;
	}

	/*管理者会社名*/
	public static String releaseCompanyChk(String releaseCompany) {
		String result = null;

		if(releaseCompany.isEmpty()) {
			return result = "発売会社を入力してください";
		}
		if(releaseCompany.length()<1 || releaseCompany.length()>15) {
			result ="発売会社は1文字以上15文字以下で入力してください";
		}
		if(!releaseCompany.matches("[ぁ-ゞ-一-龠-ァ-ヺー0-9-a-zA-Z]+$")) {
			result = "会社名はひらがな、漢字、半角数字、半角英字で入力してください";
		}

		return result;
	}

	/*管理者商品価格*/
	public static String priceChk(String price) {
		String result = null;

		if(price.isEmpty()) {
			return result = "商品価格を入力してください";
		}
		if(!price.matches("^[0-9]+$")) {
			return result = "商品価格は数字で入力してください";
		}
		if(Integer.parseInt(price)<100 || Integer.parseInt(price)>1000000) {
			result = "商品価格は100円以上100万円以内で入力してください";
		}
		return result;
	}

	/*管理者商品詳細*/
	public static String productDescriptionChk(String productDescription) {
		String result = null;

		if(productDescription.isEmpty()) {
			result = "商品詳細を入力してください";
		}
		if(productDescription.length()<1 || productDescription.length()>200) {
			result = "商品詳細は1文字以上200文字以下で入力してください";
		}
		if(!productDescription.matches("[ぁ-ゞ-一-龠ー0-9-a-zA-Z-０-９-!?-！？]+$")) {
			result = "商品詳細は正しく入力してください";
		}
		return result;
	}

	/* 管理者画像ファイル */
	public static String imageFilePathChk(String imageFilePath) {
		String result = null;

		if(imageFilePath.equals(null) || imageFilePath.equals("")) {
			result = "画像ファイルを選んでください";
		}

		return result;
	}
}
