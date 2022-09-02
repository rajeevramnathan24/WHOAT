package core.Utils;

//package com.langParser;
//
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LangParser {

	@SerializedName("course")
	@Expose
	private Course course;
	@SerializedName("general")
	@Expose
	private General general;
	@SerializedName("self_paced")
	@Expose
	private SelfPaced selfPaced;
	@SerializedName("my_learning")
	@Expose
	private MyLearning myLearning;
	@SerializedName("my_profile")
	@Expose
	private MyProfile myProfile;
	@SerializedName("dashboard")
	@Expose
	private Dashboard dashboard;
	@SerializedName("data")
	@Expose
	private Data data;
	@SerializedName("onboarding")
	@Expose
	private Onboarding onboarding;
	@SerializedName("search")
	@Expose
	private Search search;
	@SerializedName("achievements")
	@Expose
	private Achievements achievements;
	@SerializedName("vle")
	@Expose
	private Vle vle;
	@SerializedName("discussions")
	@Expose
	private Discussions discussions;
	@SerializedName("welcome")
	@Expose
	private Welcome__1 welcome;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public General getGeneral() {
		return general;
	}

	public void setGeneral(General general) {
		this.general = general;
	}

	public SelfPaced getSelfPaced() {
		return selfPaced;
	}

	public void setSelfPaced(SelfPaced selfPaced) {
		this.selfPaced = selfPaced;
	}

	public MyLearning getMyLearning() {
		return myLearning;
	}

	public void setMyLearning(MyLearning myLearning) {
		this.myLearning = myLearning;
	}

	public MyProfile getMyProfile() {
		return myProfile;
	}

	public void setMyProfile(MyProfile myProfile) {
		this.myProfile = myProfile;
	}

	public Dashboard getDashboard() {
		return dashboard;
	}

	public void setDashboard(Dashboard dashboard) {
		this.dashboard = dashboard;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Onboarding getOnboarding() {
		return onboarding;
	}

	public void setOnboarding(Onboarding onboarding) {
		this.onboarding = onboarding;
	}

	public Search getSearch() {
		return search;
	}

	public void setSearch(Search search) {
		this.search = search;
	}

	public Achievements getAchievements() {
		return achievements;
	}

	public void setAchievements(Achievements achievements) {
		this.achievements = achievements;
	}

	public Vle getVle() {
		return vle;
	}

	public void setVle(Vle vle) {
		this.vle = vle;
	}

	public Discussions getDiscussions() {
		return discussions;
	}

	public void setDiscussions(Discussions discussions) {
		this.discussions = discussions;
	}

	public Welcome__1 getWelcome() {
		return welcome;
	}

	public void setWelcome(Welcome__1 welcome) {
		this.welcome = welcome;
	}

	//}



	//@Generated("jsonschema2pojo")
	public static class Account {

		@SerializedName("title")
		@Expose
		private String title;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

	}
	//-----------------------------------com.langParser.Achievements.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Achievements {

		@SerializedName("empty")
		@Expose
		private Empty__4 empty;
		@SerializedName("copy_url")
		@Expose
		private String copyUrl;
		@SerializedName("issuer_name")
		@Expose
		private String issuerName;
		@SerializedName("microcredentials")
		@Expose
		private String microcredentials;
		@SerializedName("url_copied")
		@Expose
		private String urlCopied;
		@SerializedName("valid_from")
		@Expose
		private String validFrom;
		@SerializedName("microcredential")
		@Expose
		private String microcredential;
		@SerializedName("view_credential")
		@Expose
		private String viewCredential;
		@SerializedName("share_credential")
		@Expose
		private String shareCredential;

		public Empty__4 getEmpty() {
			return empty;
		}

		public void setEmpty(Empty__4 empty) {
			this.empty = empty;
		}

		public String getCopyUrl() {
			return copyUrl;
		}

		public void setCopyUrl(String copyUrl) {
			this.copyUrl = copyUrl;
		}

		public String getIssuerName() {
			return issuerName;
		}

		public void setIssuerName(String issuerName) {
			this.issuerName = issuerName;
		}

		public String getMicrocredentials() {
			return microcredentials;
		}

		public void setMicrocredentials(String microcredentials) {
			this.microcredentials = microcredentials;
		}

		public String getUrlCopied() {
			return urlCopied;
		}

		public void setUrlCopied(String urlCopied) {
			this.urlCopied = urlCopied;
		}

		public String getValidFrom() {
			return validFrom;
		}

		public void setValidFrom(String validFrom) {
			this.validFrom = validFrom;
		}

		public String getMicrocredential() {
			return microcredential;
		}

		public void setMicrocredential(String microcredential) {
			this.microcredential = microcredential;
		}

		public String getViewCredential() {
			return viewCredential;
		}

		public void setViewCredential(String viewCredential) {
			this.viewCredential = viewCredential;
		}

		public String getShareCredential() {
			return shareCredential;
		}

		public void setShareCredential(String shareCredential) {
			this.shareCredential = shareCredential;
		}

	}
	//-----------------------------------com.langParser.Age.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Age {

		@SerializedName("8")
		@Expose
		private String _8;

		public String get8() {
			return _8;
		}

		public void set8(String _8) {
			this._8 = _8;
		}

	}
	//-----------------------------------com.langParser.Alert.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Alert {

		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("message")
		@Expose
		private String message;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

	}
	//-----------------------------------com.langParser.Alert__1.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Alert__1 {

		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("subtitle")
		@Expose
		private String subtitle;
		@SerializedName("button")
		@Expose
		private String button;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getSubtitle() {
			return subtitle;
		}

		public void setSubtitle(String subtitle) {
			this.subtitle = subtitle;
		}

		public String getButton() {
			return button;
		}

		public void setButton(String button) {
			this.button = button;
		}

	}
	//-----------------------------------com.langParser.Begin.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Begin {

		@SerializedName("title")
		@Expose
		private String title;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

	}
	//-----------------------------------com.langParser.Breadcrumb.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Breadcrumb {

		@SerializedName("course")
		@Expose
		private String course;
		@SerializedName("all_courses")
		@Expose
		private String allCourses;

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public String getAllCourses() {
			return allCourses;
		}

		public void setAllCourses(String allCourses) {
			this.allCourses = allCourses;
		}

	}
	//-----------------------------------com.langParser.Button.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Button {

		@SerializedName("ios")
		@Expose
		private String ios;
		@SerializedName("android")
		@Expose
		private String android;

		public String getIos() {
			return ios;
		}

		public void setIos(String ios) {
			this.ios = ios;
		}

		public String getAndroid() {
			return android;
		}

		public void setAndroid(String android) {
			this.android = android;
		}

	}
	//-----------------------------------com.langParser.Certificate.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Certificate {

		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("body")
		@Expose
		private String body;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getBody() {
			return body;
		}

		public void setBody(String body) {
			this.body = body;
		}

	}
	//-----------------------------------com.langParser.Complete.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Complete {

		@SerializedName("title")
		@Expose
		private String title;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

	}
	//-----------------------------------com.langParser.Completed.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Completed {

		@SerializedName("empty")
		@Expose
		private Empty__1 empty;

		public Empty__1 getEmpty() {
			return empty;
		}

		public void setEmpty(Empty__1 empty) {
			this.empty = empty;
		}

	}
	//-----------------------------------com.langParser.Completed__1.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Completed__1 {

		@SerializedName("subtitle")
		@Expose
		private String subtitle;
		@SerializedName("message")
		@Expose
		private String message;

		public String getSubtitle() {
			return subtitle;
		}

		public void setSubtitle(String subtitle) {
			this.subtitle = subtitle;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

	}
	//-----------------------------------com.langParser.Contents.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Contents {

		@SerializedName("title")
		@Expose
		private String title;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

	}
	//-----------------------------------com.langParser.ContinueLearning.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class ContinueLearning {

		@SerializedName("empty")
		@Expose
		private Empty empty;

		public Empty getEmpty() {
			return empty;
		}

		public void setEmpty(Empty empty) {
			this.empty = empty;
		}

	}
	//-----------------------------------com.langParser.ContinueLearning__1.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class ContinueLearning__1 {

		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("empty")
		@Expose
		private Empty__2 empty;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Empty__2 getEmpty() {
			return empty;
		}

		public void setEmpty(Empty__2 empty) {
			this.empty = empty;
		}

	}
	//-----------------------------------com.langParser.Country.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Country {

		@SerializedName("label")
		@Expose
		private String label;
		@SerializedName("hint")
		@Expose
		private String hint;

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getHint() {
			return hint;
		}

		public void setHint(String hint) {
			this.hint = hint;
		}

	}
	//-----------------------------------com.langParser.Course.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Course {

		@SerializedName("x_learners_enrolled_1")
		@Expose
		private String xLearnersEnrolled1;
		@SerializedName("x_learners_enrolled_5")
		@Expose
		private String xLearnersEnrolled5;
		@SerializedName("x_learners_enrolled_0")
		@Expose
		private String xLearnersEnrolled0;
		@SerializedName("requires_x_months_1")
		@Expose
		private String requiresXMonths1;
		@SerializedName("requires_x_months_5")
		@Expose
		private String requiresXMonths5;
		@SerializedName("requires_x_months_0")
		@Expose
		private String requiresXMonths0;
		@SerializedName("enroll_now")
		@Expose
		private String enrollNow;
		@SerializedName("x_reviews_1")
		@Expose
		private String xReviews1;
		@SerializedName("x_reviews_5")
		@Expose
		private String xReviews5;
		@SerializedName("x_reviews_0")
		@Expose
		private String xReviews0;
		@SerializedName("review_modules")
		@Expose
		private String reviewModules;
		@SerializedName("certificate")
		@Expose
		private Certificate certificate;
		@SerializedName("contents")
		@Expose
		private Contents contents;
		@SerializedName("introduction_video")
		@Expose
		private String introductionVideo;
		@SerializedName("save_for_later")
		@Expose
		private String saveForLater;
		@SerializedName("start_learning")
		@Expose
		private String startLearning;
		@SerializedName("continue_learning")
		@Expose
		private String continueLearning;
		@SerializedName("started_on_date")
		@Expose
		private String startedOnDate;
		@SerializedName("x_modules_5")
		@Expose
		private String xModules5;
		@SerializedName("x_modules_1")
		@Expose
		private String xModules1;
		@SerializedName("x_modules_0")
		@Expose
		private String xModules0;
		@SerializedName("x_percent_complete")
		@Expose
		private String xPercentComplete;
		@SerializedName("enrolled")
		@Expose
		private String enrolled;
		@SerializedName("enrolled_alert")
		@Expose
		private EnrolledAlert enrolledAlert;
		@SerializedName("unenroll")
		@Expose
		private Unenroll unenroll;
		@SerializedName("completed_successfully")
		@Expose
		private String completedSuccessfully;
		@SerializedName("learning_programme")
		@Expose
		private LearningProgramme learningProgramme;
		@SerializedName("tab")
		@Expose
		private Tab tab;
		@SerializedName("breadcrumb")
		@Expose
		private Breadcrumb breadcrumb;
		@SerializedName("enrollments_closed")
		@Expose
		private String enrollmentsClosed;
		@SerializedName("x_chapters_0")
		@Expose
		private String xChapters0;
		@SerializedName("x_chapters_1")
		@Expose
		private String xChapters1;
		@SerializedName("x_chapters_3")
		@Expose
		private String xChapters3;
		@SerializedName("x_chapters_4")
		@Expose
		private String xChapters4;
		@SerializedName("x_chapters_5")
		@Expose
		private String xChapters5;

		public String getxLearnersEnrolled1() {
			return xLearnersEnrolled1;
		}

		public void setxLearnersEnrolled1(String xLearnersEnrolled1) {
			this.xLearnersEnrolled1 = xLearnersEnrolled1;
		}

		public String getxLearnersEnrolled5() {
			return xLearnersEnrolled5;
		}

		public void setxLearnersEnrolled5(String xLearnersEnrolled5) {
			this.xLearnersEnrolled5 = xLearnersEnrolled5;
		}

		public String getxLearnersEnrolled0() {
			return xLearnersEnrolled0;
		}

		public void setxLearnersEnrolled0(String xLearnersEnrolled0) {
			this.xLearnersEnrolled0 = xLearnersEnrolled0;
		}

		public String getRequiresXMonths1() {
			return requiresXMonths1;
		}

		public void setRequiresXMonths1(String requiresXMonths1) {
			this.requiresXMonths1 = requiresXMonths1;
		}

		public String getRequiresXMonths5() {
			return requiresXMonths5;
		}

		public void setRequiresXMonths5(String requiresXMonths5) {
			this.requiresXMonths5 = requiresXMonths5;
		}

		public String getRequiresXMonths0() {
			return requiresXMonths0;
		}

		public void setRequiresXMonths0(String requiresXMonths0) {
			this.requiresXMonths0 = requiresXMonths0;
		}

		public String getEnrollNow() {
			return enrollNow;
		}

		public void setEnrollNow(String enrollNow) {
			this.enrollNow = enrollNow;
		}

		public String getxReviews1() {
			return xReviews1;
		}

		public void setxReviews1(String xReviews1) {
			this.xReviews1 = xReviews1;
		}

		public String getxReviews5() {
			return xReviews5;
		}

		public void setxReviews5(String xReviews5) {
			this.xReviews5 = xReviews5;
		}

		public String getxReviews0() {
			return xReviews0;
		}

		public void setxReviews0(String xReviews0) {
			this.xReviews0 = xReviews0;
		}

		public String getReviewModules() {
			return reviewModules;
		}

		public void setReviewModules(String reviewModules) {
			this.reviewModules = reviewModules;
		}

		public Certificate getCertificate() {
			return certificate;
		}

		public void setCertificate(Certificate certificate) {
			this.certificate = certificate;
		}

		public Contents getContents() {
			return contents;
		}

		public void setContents(Contents contents) {
			this.contents = contents;
		}

		public String getIntroductionVideo() {
			return introductionVideo;
		}

		public void setIntroductionVideo(String introductionVideo) {
			this.introductionVideo = introductionVideo;
		}

		public String getSaveForLater() {
			return saveForLater;
		}

		public void setSaveForLater(String saveForLater) {
			this.saveForLater = saveForLater;
		}

		public String getStartLearning() {
			return startLearning;
		}

		public void setStartLearning(String startLearning) {
			this.startLearning = startLearning;
		}

		public String getContinueLearning() {
			return continueLearning;
		}

		public void setContinueLearning(String continueLearning) {
			this.continueLearning = continueLearning;
		}

		public String getStartedOnDate() {
			return startedOnDate;
		}

		public void setStartedOnDate(String startedOnDate) {
			this.startedOnDate = startedOnDate;
		}

		public String getxModules5() {
			return xModules5;
		}

		public void setxModules5(String xModules5) {
			this.xModules5 = xModules5;
		}

		public String getxModules1() {
			return xModules1;
		}

		public void setxModules1(String xModules1) {
			this.xModules1 = xModules1;
		}

		public String getxModules0() {
			return xModules0;
		}

		public void setxModules0(String xModules0) {
			this.xModules0 = xModules0;
		}

		public String getxPercentComplete() {
			return xPercentComplete;
		}

		public void setxPercentComplete(String xPercentComplete) {
			this.xPercentComplete = xPercentComplete;
		}

		public String getEnrolled() {
			return enrolled;
		}

		public void setEnrolled(String enrolled) {
			this.enrolled = enrolled;
		}

		public EnrolledAlert getEnrolledAlert() {
			return enrolledAlert;
		}

		public void setEnrolledAlert(EnrolledAlert enrolledAlert) {
			this.enrolledAlert = enrolledAlert;
		}

		public Unenroll getUnenroll() {
			return unenroll;
		}

		public void setUnenroll(Unenroll unenroll) {
			this.unenroll = unenroll;
		}

		public String getCompletedSuccessfully() {
			return completedSuccessfully;
		}

		public void setCompletedSuccessfully(String completedSuccessfully) {
			this.completedSuccessfully = completedSuccessfully;
		}

		public LearningProgramme getLearningProgramme() {
			return learningProgramme;
		}

		public void setLearningProgramme(LearningProgramme learningProgramme) {
			this.learningProgramme = learningProgramme;
		}

		public Tab getTab() {
			return tab;
		}

		public void setTab(Tab tab) {
			this.tab = tab;
		}

		public Breadcrumb getBreadcrumb() {
			return breadcrumb;
		}

		public void setBreadcrumb(Breadcrumb breadcrumb) {
			this.breadcrumb = breadcrumb;
		}

		public String getEnrollmentsClosed() {
			return enrollmentsClosed;
		}

		public void setEnrollmentsClosed(String enrollmentsClosed) {
			this.enrollmentsClosed = enrollmentsClosed;
		}

		public String getxChapters0() {
			return xChapters0;
		}

		public void setxChapters0(String xChapters0) {
			this.xChapters0 = xChapters0;
		}

		public String getxChapters1() {
			return xChapters1;
		}

		public void setxChapters1(String xChapters1) {
			this.xChapters1 = xChapters1;
		}

		public String getxChapters3() {
			return xChapters3;
		}

		public void setxChapters3(String xChapters3) {
			this.xChapters3 = xChapters3;
		}

		public String getxChapters4() {
			return xChapters4;
		}

		public void setxChapters4(String xChapters4) {
			this.xChapters4 = xChapters4;
		}

		public String getxChapters5() {
			return xChapters5;
		}

		public void setxChapters5(String xChapters5) {
			this.xChapters5 = xChapters5;
		}

	}
	//-----------------------------------com.langParser.CourseDuration.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class CourseDuration {

		@SerializedName("1month")
		@Expose
		private String _1month;
		@SerializedName("1day")
		@Expose
		private String _1day;
		@SerializedName("1week")
		@Expose
		private String _1week;
		@SerializedName("3months")
		@Expose
		private String _3months;
		@SerializedName("1year")
		@Expose
		private String _1year;
		@SerializedName("6months")
		@Expose
		private String _6months;

		public String get1month() {
			return _1month;
		}

		public void set1month(String _1month) {
			this._1month = _1month;
		}

		public String get1day() {
			return _1day;
		}

		public void set1day(String _1day) {
			this._1day = _1day;
		}

		public String get1week() {
			return _1week;
		}

		public void set1week(String _1week) {
			this._1week = _1week;
		}

		public String get3months() {
			return _3months;
		}

		public void set3months(String _3months) {
			this._3months = _3months;
		}

		public String get1year() {
			return _1year;
		}

		public void set1year(String _1year) {
			this._1year = _1year;
		}

		public String get6months() {
			return _6months;
		}

		public void set6months(String _6months) {
			this._6months = _6months;
		}

	}
	//-----------------------------------com.langParser.CurrentRole.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class CurrentRole {

		@SerializedName("label")
		@Expose
		private String label;
		@SerializedName("hint")
		@Expose
		private String hint;

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getHint() {
			return hint;
		}

		public void setHint(String hint) {
			this.hint = hint;
		}

	}
	//-----------------------------------com.langParser.CurrentRoleDuration.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class CurrentRoleDuration {

		@SerializedName("lessThanSixMonths")
		@Expose
		private String lessThanSixMonths;
		@SerializedName("lessThanOneYear")
		@Expose
		private String lessThanOneYear;
		@SerializedName("oneToTwoYears")
		@Expose
		private String oneToTwoYears;
		@SerializedName("twoToThreeYears")
		@Expose
		private String twoToThreeYears;
		@SerializedName("threeToFiveYears")
		@Expose
		private String threeToFiveYears;
		@SerializedName("moreThanFiveYears")
		@Expose
		private String moreThanFiveYears;

		public String getLessThanSixMonths() {
			return lessThanSixMonths;
		}

		public void setLessThanSixMonths(String lessThanSixMonths) {
			this.lessThanSixMonths = lessThanSixMonths;
		}

		public String getLessThanOneYear() {
			return lessThanOneYear;
		}

		public void setLessThanOneYear(String lessThanOneYear) {
			this.lessThanOneYear = lessThanOneYear;
		}

		public String getOneToTwoYears() {
			return oneToTwoYears;
		}

		public void setOneToTwoYears(String oneToTwoYears) {
			this.oneToTwoYears = oneToTwoYears;
		}

		public String getTwoToThreeYears() {
			return twoToThreeYears;
		}

		public void setTwoToThreeYears(String twoToThreeYears) {
			this.twoToThreeYears = twoToThreeYears;
		}

		public String getThreeToFiveYears() {
			return threeToFiveYears;
		}

		public void setThreeToFiveYears(String threeToFiveYears) {
			this.threeToFiveYears = threeToFiveYears;
		}

		public String getMoreThanFiveYears() {
			return moreThanFiveYears;
		}

		public void setMoreThanFiveYears(String moreThanFiveYears) {
			this.moreThanFiveYears = moreThanFiveYears;
		}

	}
	//-----------------------------------com.langParser.Dashboard.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public static class Dashboard {

		@SerializedName("continue_learning")
		@Expose
		private ContinueLearning__1 continueLearning;
		@SerializedName("title")
		@Expose
		private String title;

		@SerializedName("discover_learning")
		@Expose
		private String discoverLearning;

		@SerializedName("welcome")
		@Expose
		private Welcome welcome;
		@SerializedName("upcoming_events")
		@Expose
		private UpcomingEvents upcomingEvents;
		@SerializedName("complete_your_profile")
		@Expose
		private String completeYourProfile;
		@SerializedName("feedback")
		@Expose
		private Feedback feedback;

		public ContinueLearning__1 getContinueLearning() {
			return continueLearning;
		}

		public void setContinueLearning(ContinueLearning__1 continueLearning) {
			this.continueLearning = continueLearning;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDiscoverLearning() {
			return discoverLearning;
		}

		public void setDiscoverLearning(String discoverLearning) {
			this.discoverLearning = discoverLearning;
		}

		public Welcome getWelcome() {
			return welcome;
		}

		public void setWelcome(Welcome welcome) {
			this.welcome = welcome;
		}

		public UpcomingEvents getUpcomingEvents() {
			return upcomingEvents;
		}

		public void setUpcomingEvents(UpcomingEvents upcomingEvents) {
			this.upcomingEvents = upcomingEvents;
		}

		public String getCompleteYourProfile() {
			return completeYourProfile;
		}

		public void setCompleteYourProfile(String completeYourProfile) {
			this.completeYourProfile = completeYourProfile;
		}

		public Feedback getFeedback() {
			return feedback;
		}

		public void setFeedback(Feedback feedback) {
			this.feedback = feedback;
		}

	}
	//-----------------------------------com.langParser.Data.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Data {

		@SerializedName("current_role_duration")
		@Expose
		private CurrentRoleDuration currentRoleDuration;
		@SerializedName("language")
		@Expose
		private Language__1 language;
		@SerializedName("streaming_quality")
		@Expose
		private StreamingQuality streamingQuality;
		@SerializedName("course_duration")
		@Expose
		private CourseDuration courseDuration;
		@SerializedName("role_tenure")
		@Expose
		private RoleTenure roleTenure;
		@SerializedName("gender")
		@Expose
		private Gender__1 gender;
		@SerializedName("release_date")
		@Expose
		private ReleaseDate releaseDate;
		@SerializedName("age")
		@Expose
		private Age age;
		@SerializedName("pacing")
		@Expose
		private Pacing pacing;

		public CurrentRoleDuration getCurrentRoleDuration() {
			return currentRoleDuration;
		}

		public void setCurrentRoleDuration(CurrentRoleDuration currentRoleDuration) {
			this.currentRoleDuration = currentRoleDuration;
		}

		public Language__1 getLanguage() {
			return language;
		}

		public void setLanguage(Language__1 language) {
			this.language = language;
		}

		public StreamingQuality getStreamingQuality() {
			return streamingQuality;
		}

		public void setStreamingQuality(StreamingQuality streamingQuality) {
			this.streamingQuality = streamingQuality;
		}

		public CourseDuration getCourseDuration() {
			return courseDuration;
		}

		public void setCourseDuration(CourseDuration courseDuration) {
			this.courseDuration = courseDuration;
		}

		public RoleTenure getRoleTenure() {
			return roleTenure;
		}

		public void setRoleTenure(RoleTenure roleTenure) {
			this.roleTenure = roleTenure;
		}

		public Gender__1 getGender() {
			return gender;
		}

		public void setGender(Gender__1 gender) {
			this.gender = gender;
		}

		public ReleaseDate getReleaseDate() {
			return releaseDate;
		}

		public void setReleaseDate(ReleaseDate releaseDate) {
			this.releaseDate = releaseDate;
		}

		public Age getAge() {
			return age;
		}

		public void setAge(Age age) {
			this.age = age;
		}

		public Pacing getPacing() {
			return pacing;
		}

		public void setPacing(Pacing pacing) {
			this.pacing = pacing;
		}

	}
	//-----------------------------------com.langParser.DeletePicture.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class DeletePicture {

		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("subtitle")
		@Expose
		private String subtitle;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getSubtitle() {
			return subtitle;
		}

		public void setSubtitle(String subtitle) {
			this.subtitle = subtitle;
		}

	}
	//-----------------------------------com.langParser.Details.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Details {

		@SerializedName("heading")
		@Expose
		private String heading;
		@SerializedName("subheading")
		@Expose
		private String subheading;
		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("edit_picture")
		@Expose
		private String editPicture;
		@SerializedName("job_role")
		@Expose
		private JobRole jobRole;
		@SerializedName("job_tenure")
		@Expose
		private JobTenure jobTenure;
		@SerializedName("full_name")
		@Expose
		private String fullName;
		@SerializedName("email")
		@Expose
		private String email;
		@SerializedName("age")
		@Expose
		private String age;
		@SerializedName("gender")
		@Expose
		private String gender;
		@SerializedName("remove_photo")
		@Expose
		private String removePhoto;
		@SerializedName("choose_photo")
		@Expose
		private String choosePhoto;
		@SerializedName("move_and_scale")
		@Expose
		private String moveAndScale;
		@SerializedName("update_picture")
		@Expose
		private String updatePicture;
		@SerializedName("first_name")
		@Expose
		private String firstName;
		@SerializedName("last_name")
		@Expose
		private String lastName;

		public String getHeading() {
			return heading;
		}

		public void setHeading(String heading) {
			this.heading = heading;
		}

		public String getSubheading() {
			return subheading;
		}

		public void setSubheading(String subheading) {
			this.subheading = subheading;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getEditPicture() {
			return editPicture;
		}

		public void setEditPicture(String editPicture) {
			this.editPicture = editPicture;
		}

		public JobRole getJobRole() {
			return jobRole;
		}

		public void setJobRole(JobRole jobRole) {
			this.jobRole = jobRole;
		}

		public JobTenure getJobTenure() {
			return jobTenure;
		}

		public void setJobTenure(JobTenure jobTenure) {
			this.jobTenure = jobTenure;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getRemovePhoto() {
			return removePhoto;
		}

		public void setRemovePhoto(String removePhoto) {
			this.removePhoto = removePhoto;
		}

		public String getChoosePhoto() {
			return choosePhoto;
		}

		public void setChoosePhoto(String choosePhoto) {
			this.choosePhoto = choosePhoto;
		}

		public String getMoveAndScale() {
			return moveAndScale;
		}

		public void setMoveAndScale(String moveAndScale) {
			this.moveAndScale = moveAndScale;
		}

		public String getUpdatePicture() {
			return updatePicture;
		}

		public void setUpdatePicture(String updatePicture) {
			this.updatePicture = updatePicture;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

	}
	//-----------------------------------com.langParser.Discussions.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Discussions {

		@SerializedName("empty")
		@Expose
		private String empty;
		@SerializedName("heading")
		@Expose
		private String heading;
		@SerializedName("post")
		@Expose
		private Post post;

		public String getEmpty() {
			return empty;
		}

		public void setEmpty(String empty) {
			this.empty = empty;
		}

		public String getHeading() {
			return heading;
		}

		public void setHeading(String heading) {
			this.heading = heading;
		}

		public Post getPost() {
			return post;
		}

		public void setPost(Post post) {
			this.post = post;
		}

	}
	//-----------------------------------com.langParser.Duration.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Duration {

		@SerializedName("label")
		@Expose
		private String label;
		@SerializedName("hint")
		@Expose
		private String hint;

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getHint() {
			return hint;
		}

		public void setHint(String hint) {
			this.hint = hint;
		}

	}
	//-----------------------------------com.langParser.Education.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Education {

		@SerializedName("heading")
		@Expose
		private String heading;
		@SerializedName("subheading")
		@Expose
		private String subheading;

		public String getHeading() {
			return heading;
		}

		public void setHeading(String heading) {
			this.heading = heading;
		}

		public String getSubheading() {
			return subheading;
		}

		public void setSubheading(String subheading) {
			this.subheading = subheading;
		}

	}
	//-----------------------------------com.langParser.Empty.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Empty {

		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("subtitle")
		@Expose
		private String subtitle;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getSubtitle() {
			return subtitle;
		}

		public void setSubtitle(String subtitle) {
			this.subtitle = subtitle;
		}

	}
	//-----------------------------------com.langParser.Empty__1.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Empty__1 {

		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("subtitle")
		@Expose
		private String subtitle;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getSubtitle() {
			return subtitle;
		}

		public void setSubtitle(String subtitle) {
			this.subtitle = subtitle;
		}

	}
	//-----------------------------------com.langParser.Empty__2.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Empty__2 {

		@SerializedName("button")
		@Expose
		private String button;
		@SerializedName("title")
		@Expose
		private String title;

		public String getButton() {
			return button;
		}

		public void setButton(String button) {
			this.button = button;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

	}
	//-----------------------------------com.langParser.Empty__3.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Empty__3 {

		@SerializedName("subtitle")
		@Expose
		private String subtitle;
		@SerializedName("title")
		@Expose
		private String title;

		public String getSubtitle() {
			return subtitle;
		}

		public void setSubtitle(String subtitle) {
			this.subtitle = subtitle;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

	}
	//-----------------------------------com.langParser.Empty__4.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Empty__4 {

		@SerializedName("button")
		@Expose
		private String button;
		@SerializedName("subtitle")
		@Expose
		private String subtitle;
		@SerializedName("title")
		@Expose
		private String title;

		public String getButton() {
			return button;
		}

		public void setButton(String button) {
			this.button = button;
		}

		public String getSubtitle() {
			return subtitle;
		}

		public void setSubtitle(String subtitle) {
			this.subtitle = subtitle;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

	}
	//-----------------------------------com.langParser.Empty__5.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Empty__5 {

		@SerializedName("message")
		@Expose
		private String message;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

	}
	//-----------------------------------com.langParser.EnrolledAlert.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class EnrolledAlert {

		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("message")
		@Expose
		private String message;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

	}
	//-----------------------------------com.langParser.Error.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Error {

		@SerializedName("profile_image_upload")
		@Expose
		private String profileImageUpload;

		public String getProfileImageUpload() {
			return profileImageUpload;
		}

		public void setProfileImageUpload(String profileImageUpload) {
			this.profileImageUpload = profileImageUpload;
		}

	}
	//-----------------------------------com.langParser.Error__1.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Error__1 {

		@SerializedName("incomplete")
		@Expose
		private Incomplete incomplete;
		@SerializedName("zoom_not_installed")
		@Expose
		private ZoomNotInstalled zoomNotInstalled;

		public Incomplete getIncomplete() {
			return incomplete;
		}

		public void setIncomplete(Incomplete incomplete) {
			this.incomplete = incomplete;
		}

		public ZoomNotInstalled getZoomNotInstalled() {
			return zoomNotInstalled;
		}

		public void setZoomNotInstalled(ZoomNotInstalled zoomNotInstalled) {
			this.zoomNotInstalled = zoomNotInstalled;
		}

	}
	//-----------------------------------com.langParser.Feedback.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Feedback {

		@SerializedName("button")
		@Expose
		private String button;
		@SerializedName("message")
		@Expose
		private String message;
		@SerializedName("title")
		@Expose
		private String title;

		public String getButton() {
			return button;
		}

		public void setButton(String button) {
			this.button = button;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

	}
	//-----------------------------------com.langParser.Filter.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Filter {

		@SerializedName("duration")
		@Expose
		private String duration;
		@SerializedName("audience")
		@Expose
		private String audience;
		@SerializedName("goals")
		@Expose
		private String goals;
		@SerializedName("release_date")
		@Expose
		private String releaseDate;
		@SerializedName("reset")
		@Expose
		private String reset;
		@SerializedName("apply")
		@Expose
		private String apply;
		@SerializedName("language")
		@Expose
		private String language;
		@SerializedName("title")
		@Expose
		private String title;

		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getAudience() {
			return audience;
		}

		public void setAudience(String audience) {
			this.audience = audience;
		}

		public String getGoals() {
			return goals;
		}

		public void setGoals(String goals) {
			this.goals = goals;
		}

		public String getReleaseDate() {
			return releaseDate;
		}

		public void setReleaseDate(String releaseDate) {
			this.releaseDate = releaseDate;
		}

		public String getReset() {
			return reset;
		}

		public void setReset(String reset) {
			this.reset = reset;
		}

		public String getApply() {
			return apply;
		}

		public void setApply(String apply) {
			this.apply = apply;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

	}
	//-----------------------------------com.langParser.Gender.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Gender {

		@SerializedName("other")
		@Expose
		private Other other;

		public Other getOther() {
			return other;
		}

		public void setOther(Other other) {
			this.other = other;
		}

	}
	//-----------------------------------com.langParser.Gender__1.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Gender__1 {

		@SerializedName("1")
		@Expose
		private String _1;
		@SerializedName("2")
		@Expose
		private String _2;
		@SerializedName("3")
		@Expose
		private String _3;

		public String get1() {
			return _1;
		}

		public void set1(String _1) {
			this._1 = _1;
		}

		public String get2() {
			return _2;
		}

		public void set2(String _2) {
			this._2 = _2;
		}

		public String get3() {
			return _3;
		}

		public void set3(String _3) {
			this._3 = _3;
		}

	}
	//-----------------------------------com.langParser.General.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class General {

		@SerializedName("value_out_of_total")
		@Expose
		private String valueOutOfTotal;
		@SerializedName("save")
		@Expose
		private String save;
		@SerializedName("cancel")
		@Expose
		private String cancel;
		@SerializedName("change")
		@Expose
		private String change;
		@SerializedName("edit")
		@Expose
		private String edit;
		@SerializedName("next")
		@Expose
		private String next;
		@SerializedName("done")
		@Expose
		private String done;
		@SerializedName("select")
		@Expose
		private String select;
		@SerializedName("skip")
		@Expose
		private String skip;
		@SerializedName("close")
		@Expose
		private String close;
		@SerializedName("back")
		@Expose
		private String back;
		@SerializedName("no_selection")
		@Expose
		private String noSelection;
		@SerializedName("error_occurred")
		@Expose
		private String errorOccurred;
		@SerializedName("try_again")
		@Expose
		private String tryAgain;
		@SerializedName("try_again_later")
		@Expose
		private String tryAgainLater;
		@SerializedName("loading_ellipsis")
		@Expose
		private String loadingEllipsis;
		@SerializedName("choose_an_action")
		@Expose
		private String chooseAnAction;
		@SerializedName("upload")
		@Expose
		private String upload;
		@SerializedName("delete")
		@Expose
		private String delete;
		@SerializedName("dismiss")
		@Expose
		private String dismiss;
		@SerializedName("clear")
		@Expose
		private String clear;
		@SerializedName("menu")
		@Expose
		private Menu menu;
		@SerializedName("explore_learning_programmes")
		@Expose
		private String exploreLearningProgrammes;
		@SerializedName("restart_needed")
		@Expose
		private String restartNeeded;
		@SerializedName("continue")
		@Expose
		private String _continue;
		@SerializedName("ok")
		@Expose
		private String ok;
		@SerializedName("show_all")
		@Expose
		private String showAll;

		public String getValueOutOfTotal() {
			return valueOutOfTotal;
		}

		public void setValueOutOfTotal(String valueOutOfTotal) {
			this.valueOutOfTotal = valueOutOfTotal;
		}

		public String getSave() {
			return save;
		}

		public void setSave(String save) {
			this.save = save;
		}

		public String getCancel() {
			return cancel;
		}

		public void setCancel(String cancel) {
			this.cancel = cancel;
		}

		public String getChange() {
			return change;
		}

		public void setChange(String change) {
			this.change = change;
		}

		public String getEdit() {
			return edit;
		}

		public void setEdit(String edit) {
			this.edit = edit;
		}

		public String getNext() {
			return next;
		}

		public void setNext(String next) {
			this.next = next;
		}

		public String getDone() {
			return done;
		}

		public void setDone(String done) {
			this.done = done;
		}

		public String getSelect() {
			return select;
		}

		public void setSelect(String select) {
			this.select = select;
		}

		public String getSkip() {
			return skip;
		}

		public void setSkip(String skip) {
			this.skip = skip;
		}

		public String getClose() {
			return close;
		}

		public void setClose(String close) {
			this.close = close;
		}

		public String getBack() {
			return back;
		}

		public void setBack(String back) {
			this.back = back;
		}

		public String getNoSelection() {
			return noSelection;
		}

		public void setNoSelection(String noSelection) {
			this.noSelection = noSelection;
		}

		public String getErrorOccurred() {
			return errorOccurred;
		}

		public void setErrorOccurred(String errorOccurred) {
			this.errorOccurred = errorOccurred;
		}

		public String getTryAgain() {
			return tryAgain;
		}

		public void setTryAgain(String tryAgain) {
			this.tryAgain = tryAgain;
		}

		public String getTryAgainLater() {
			return tryAgainLater;
		}

		public void setTryAgainLater(String tryAgainLater) {
			this.tryAgainLater = tryAgainLater;
		}

		public String getLoadingEllipsis() {
			return loadingEllipsis;
		}

		public void setLoadingEllipsis(String loadingEllipsis) {
			this.loadingEllipsis = loadingEllipsis;
		}

		public String getChooseAnAction() {
			return chooseAnAction;
		}

		public void setChooseAnAction(String chooseAnAction) {
			this.chooseAnAction = chooseAnAction;
		}

		public String getUpload() {
			return upload;
		}

		public void setUpload(String upload) {
			this.upload = upload;
		}

		public String getDelete() {
			return delete;
		}

		public void setDelete(String delete) {
			this.delete = delete;
		}

		public String getDismiss() {
			return dismiss;
		}

		public void setDismiss(String dismiss) {
			this.dismiss = dismiss;
		}

		public String getClear() {
			return clear;
		}

		public void setClear(String clear) {
			this.clear = clear;
		}

		public Menu getMenu() {
			return menu;
		}

		public void setMenu(Menu menu) {
			this.menu = menu;
		}

		public String getExploreLearningProgrammes() {
			return exploreLearningProgrammes;
		}

		public void setExploreLearningProgrammes(String exploreLearningProgrammes) {
			this.exploreLearningProgrammes = exploreLearningProgrammes;
		}

		public String getRestartNeeded() {
			return restartNeeded;
		}

		public void setRestartNeeded(String restartNeeded) {
			this.restartNeeded = restartNeeded;
		}

		public String getContinue() {
			return _continue;
		}

		public void setContinue(String _continue) {
			this._continue = _continue;
		}

		public String getOk() {
			return ok;
		}

		public void setOk(String ok) {
			this.ok = ok;
		}

		public String getShowAll() {
			return showAll;
		}

		public void setShowAll(String showAll) {
			this.showAll = showAll;
		}

	}
	//-----------------------------------com.langParser.GetStarted.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class GetStarted {

		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("subtitle")
		@Expose
		private String subtitle;
		@SerializedName("button")
		@Expose
		private String button;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getSubtitle() {
			return subtitle;
		}

		public void setSubtitle(String subtitle) {
			this.subtitle = subtitle;
		}

		public String getButton() {
			return button;
		}

		public void setButton(String button) {
			this.button = button;
		}

	}
	//-----------------------------------com.langParser.Goals.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Goals {

		@SerializedName("skills")
		@Expose
		private String skills;
		@SerializedName("goals")
		@Expose
		private String goals;
		@SerializedName("saved")
		@Expose
		private String saved;

		public String getSkills() {
			return skills;
		}

		public void setSkills(String skills) {
			this.skills = skills;
		}

		public String getGoals() {
			return goals;
		}

		public void setGoals(String goals) {
			this.goals = goals;
		}

		public String getSaved() {
			return saved;
		}

		public void setSaved(String saved) {
			this.saved = saved;
		}

	}
	//-----------------------------------com.langParser.Goals__1.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Goals__1 {

		@SerializedName("heading")
		@Expose
		private String heading;
		@SerializedName("subheading")
		@Expose
		private String subheading;
		@SerializedName("hint")
		@Expose
		private String hint;
		@SerializedName("placeholder")
		@Expose
		private String placeholder;

		public String getHeading() {
			return heading;
		}

		public void setHeading(String heading) {
			this.heading = heading;
		}

		public String getSubheading() {
			return subheading;
		}

		public void setSubheading(String subheading) {
			this.subheading = subheading;
		}

		public String getHint() {
			return hint;
		}

		public void setHint(String hint) {
			this.hint = hint;
		}

		public String getPlaceholder() {
			return placeholder;
		}

		public void setPlaceholder(String placeholder) {
			this.placeholder = placeholder;
		}

	}
	//-----------------------------------com.langParser.Incomplete.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Incomplete {

		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("message")
		@Expose
		private String message;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

	}
	//-----------------------------------com.langParser.Interests.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Interests {

		@SerializedName("heading")
		@Expose
		private String heading;
		@SerializedName("subheading")
		@Expose
		private String subheading;

		public String getHeading() {
			return heading;
		}

		public void setHeading(String heading) {
			this.heading = heading;
		}

		public String getSubheading() {
			return subheading;
		}

		public void setSubheading(String subheading) {
			this.subheading = subheading;
		}

	}
	//-----------------------------------com.langParser.Job.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Job {

		@SerializedName("heading")
		@Expose
		private String heading;
		@SerializedName("subheading")
		@Expose
		private String subheading;
		@SerializedName("current_role")
		@Expose
		private CurrentRole currentRole;
		@SerializedName("duration")
		@Expose
		private Duration duration;
		@SerializedName("other")
		@Expose
		private Other__1 other;
		@SerializedName("title")
		@Expose
		private String title;

		public String getHeading() {
			return heading;
		}

		public void setHeading(String heading) {
			this.heading = heading;
		}

		public String getSubheading() {
			return subheading;
		}

		public void setSubheading(String subheading) {
			this.subheading = subheading;
		}

		public CurrentRole getCurrentRole() {
			return currentRole;
		}

		public void setCurrentRole(CurrentRole currentRole) {
			this.currentRole = currentRole;
		}

		public Duration getDuration() {
			return duration;
		}

		public void setDuration(Duration duration) {
			this.duration = duration;
		}

		public Other__1 getOther() {
			return other;
		}

		public void setOther(Other__1 other) {
			this.other = other;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

	}
	//-----------------------------------com.langParser.JobRole.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class JobRole {

		@SerializedName("title")
		@Expose
		private String title;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

	}
	//-----------------------------------com.langParser.JobTenure.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class JobTenure {

		@SerializedName("title")
		@Expose
		private String title;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

	}
	//-----------------------------------com.langParser.LangParser.java-----------------------------------








	//-----------------------------------com.langParser.Language.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Language {

		@SerializedName("heading")
		@Expose
		private String heading;
		@SerializedName("subheading")
		@Expose
		private String subheading;
		@SerializedName("label")
		@Expose
		private String label;

		public String getHeading() {
			return heading;
		}

		public void setHeading(String heading) {
			this.heading = heading;
		}

		public String getSubheading() {
			return subheading;
		}

		public void setSubheading(String subheading) {
			this.subheading = subheading;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

	}
	//-----------------------------------com.langParser.Language__1.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Language__1 {

		@SerializedName("en")
		@Expose
		private String en;
		@SerializedName("es")
		@Expose
		private String es;
		@SerializedName("fr")
		@Expose
		private String fr;
		@SerializedName("ar")
		@Expose
		private String ar;
		@SerializedName("ru")
		@Expose
		private String ru;
		@SerializedName("zh")
		@Expose
		private String zh;
		@SerializedName("pt")
		@Expose
		private String pt;

		public String getEn() {
			return en;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public String getEs() {
			return es;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public String getFr() {
			return fr;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public String getAr() {
			return ar;
		}

		public void setAr(String ar) {
			this.ar = ar;
		}

		public String getRu() {
			return ru;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public String getZh() {
			return zh;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public String getPt() {
			return pt;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

	}
	//-----------------------------------com.langParser.LearningProgramme.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class LearningProgramme {

		@SerializedName("begin")
		@Expose
		private Begin begin;
		@SerializedName("start")
		@Expose
		private Start start;
		@SerializedName("complete")
		@Expose
		private Complete complete;

		public Begin getBegin() {
			return begin;
		}

		public void setBegin(Begin begin) {
			this.begin = begin;
		}

		public Start getStart() {
			return start;
		}

		public void setStart(Start start) {
			this.start = start;
		}

		public Complete getComplete() {
			return complete;
		}

		public void setComplete(Complete complete) {
			this.complete = complete;
		}

	}
	//-----------------------------------com.langParser.Location.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Location {

		@SerializedName("heading")
		@Expose
		private String heading;
		@SerializedName("subheading")
		@Expose
		private String subheading;
		@SerializedName("country")
		@Expose
		private Country country;

		public String getHeading() {
			return heading;
		}

		public void setHeading(String heading) {
			this.heading = heading;
		}

		public String getSubheading() {
			return subheading;
		}

		public void setSubheading(String subheading) {
			this.subheading = subheading;
		}

		public Country getCountry() {
			return country;
		}

		public void setCountry(Country country) {
			this.country = country;
		}

	}
	//-----------------------------------com.langParser.LogOut.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class LogOut {

		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("alert")
		@Expose
		private Alert__1 alert;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Alert__1 getAlert() {
			return alert;
		}

		public void setAlert(Alert__1 alert) {
			this.alert = alert;
		}

	}
	//-----------------------------------com.langParser.Menu.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Menu {

		@SerializedName("home")
		@Expose
		private String home;
		@SerializedName("my_learning")
		@Expose
		private String myLearning;

		public String getHome() {
			return home;
		}

		public void setHome(String home) {
			this.home = home;
		}

		public String getMyLearning() {
			return myLearning;
		}

		public void setMyLearning(String myLearning) {
			this.myLearning = myLearning;
		}

	}
	//-----------------------------------com.langParser.Microcredential.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Microcredential {

		@SerializedName("subtitle")
		@Expose
		private String subtitle;
		@SerializedName("message")
		@Expose
		private String message;
		@SerializedName("button")
		@Expose
		private String button;

		public String getSubtitle() {
			return subtitle;
		}

		public void setSubtitle(String subtitle) {
			this.subtitle = subtitle;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getButton() {
			return button;
		}

		public void setButton(String button) {
			this.button = button;
		}

	}
	//-----------------------------------com.langParser.MyLearning.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class MyLearning {

		@SerializedName("heading")
		@Expose
		private String heading;
		@SerializedName("section")
		@Expose
		private Section section;
		@SerializedName("tab")
		@Expose
		private Tab__1 tab;
		@SerializedName("continue_learning")
		@Expose
		private ContinueLearning continueLearning;
		@SerializedName("completed")
		@Expose
		private Completed completed;

		public String getHeading() {
			return heading;
		}

		public void setHeading(String heading) {
			this.heading = heading;
		}

		public Section getSection() {
			return section;
		}

		public void setSection(Section section) {
			this.section = section;
		}

		public Tab__1 getTab() {
			return tab;
		}

		public void setTab(Tab__1 tab) {
			this.tab = tab;
		}

		public ContinueLearning getContinueLearning() {
			return continueLearning;
		}

		public void setContinueLearning(ContinueLearning continueLearning) {
			this.continueLearning = continueLearning;
		}

		public Completed getCompleted() {
			return completed;
		}

		public void setCompleted(Completed completed) {
			this.completed = completed;
		}

	}
	//-----------------------------------com.langParser.MyProfile.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class MyProfile {

		@SerializedName("details")
		@Expose
		private Details details;
		@SerializedName("heading")
		@Expose
		private String heading;
		@SerializedName("education")
		@Expose
		private Education education;
		@SerializedName("skills")
		@Expose
		private Skills skills;
		@SerializedName("language")
		@Expose
		private Language language;
		@SerializedName("interests")
		@Expose
		private Interests interests;
		@SerializedName("privacy")
		@Expose
		private Privacy privacy;
		@SerializedName("log_out")
		@Expose
		private LogOut logOut;
		@SerializedName("feedback")
		@Expose
		private String feedback;
		@SerializedName("designed_by")
		@Expose
		private String designedBy;
		@SerializedName("who_academy")
		@Expose
		private String whoAcademy;
		@SerializedName("account")
		@Expose
		private Account account;
		@SerializedName("account_preferences")
		@Expose
		private String accountPreferences;
		@SerializedName("goals_and_skills")
		@Expose
		private String goalsAndSkills;
		@SerializedName("goals")
		@Expose
		private Goals goals;
		@SerializedName("profile_image")
		@Expose
		private String profileImage;
		@SerializedName("edit_profile")
		@Expose
		private String editProfile;
		@SerializedName("gender")
		@Expose
		private Gender gender;
		@SerializedName("error")
		@Expose
		private Error error;
		@SerializedName("terms_conditions")
		@Expose
		private String termsConditions;
		@SerializedName("delete_picture")
		@Expose
		private DeletePicture deletePicture;

		public Details getDetails() {
			return details;
		}

		public void setDetails(Details details) {
			this.details = details;
		}

		public String getHeading() {
			return heading;
		}

		public void setHeading(String heading) {
			this.heading = heading;
		}

		public Education getEducation() {
			return education;
		}

		public void setEducation(Education education) {
			this.education = education;
		}

		public Skills getSkills() {
			return skills;
		}

		public void setSkills(Skills skills) {
			this.skills = skills;
		}

		public Language getLanguage() {
			return language;
		}

		public void setLanguage(Language language) {
			this.language = language;
		}

		public Interests getInterests() {
			return interests;
		}

		public void setInterests(Interests interests) {
			this.interests = interests;
		}

		public Privacy getPrivacy() {
			return privacy;
		}

		public void setPrivacy(Privacy privacy) {
			this.privacy = privacy;
		}

		public LogOut getLogOut() {
			return logOut;
		}

		public void setLogOut(LogOut logOut) {
			this.logOut = logOut;
		}

		public String getFeedback() {
			return feedback;
		}

		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}

		public String getDesignedBy() {
			return designedBy;
		}

		public void setDesignedBy(String designedBy) {
			this.designedBy = designedBy;
		}

		public String getWhoAcademy() {
			return whoAcademy;
		}

		public void setWhoAcademy(String whoAcademy) {
			this.whoAcademy = whoAcademy;
		}

		public Account getAccount() {
			return account;
		}

		public void setAccount(Account account) {
			this.account = account;
		}

		public String getAccountPreferences() {
			return accountPreferences;
		}

		public void setAccountPreferences(String accountPreferences) {
			this.accountPreferences = accountPreferences;
		}

		public String getGoalsAndSkills() {
			return goalsAndSkills;
		}

		public void setGoalsAndSkills(String goalsAndSkills) {
			this.goalsAndSkills = goalsAndSkills;
		}

		public Goals getGoals() {
			return goals;
		}

		public void setGoals(Goals goals) {
			this.goals = goals;
		}

		public String getProfileImage() {
			return profileImage;
		}

		public void setProfileImage(String profileImage) {
			this.profileImage = profileImage;
		}

		public String getEditProfile() {
			return editProfile;
		}

		public void setEditProfile(String editProfile) {
			this.editProfile = editProfile;
		}

		public Gender getGender() {
			return gender;
		}

		public void setGender(Gender gender) {
			this.gender = gender;
		}

		public Error getError() {
			return error;
		}

		public void setError(Error error) {
			this.error = error;
		}

		public String getTermsConditions() {
			return termsConditions;
		}

		public void setTermsConditions(String termsConditions) {
			this.termsConditions = termsConditions;
		}

		public DeletePicture getDeletePicture() {
			return deletePicture;
		}

		public void setDeletePicture(DeletePicture deletePicture) {
			this.deletePicture = deletePicture;
		}

	}
	//-----------------------------------com.langParser.Onboarding.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Onboarding {

		@SerializedName("job")
		@Expose
		private Job job;
		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("location")
		@Expose
		private Location location;
		@SerializedName("goals")
		@Expose
		private Goals__1 goals;
		@SerializedName("get_started")
		@Expose
		private GetStarted getStarted;
		@SerializedName("steps")
		@Expose
		private Steps steps;

		public Job getJob() {
			return job;
		}

		public void setJob(Job job) {
			this.job = job;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Location getLocation() {
			return location;
		}

		public void setLocation(Location location) {
			this.location = location;
		}

		public Goals__1 getGoals() {
			return goals;
		}

		public void setGoals(Goals__1 goals) {
			this.goals = goals;
		}

		public GetStarted getGetStarted() {
			return getStarted;
		}

		public void setGetStarted(GetStarted getStarted) {
			this.getStarted = getStarted;
		}

		public Steps getSteps() {
			return steps;
		}

		public void setSteps(Steps steps) {
			this.steps = steps;
		}

	}
	//-----------------------------------com.langParser.Other.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Other {

		@SerializedName("please_specify")
		@Expose
		private String pleaseSpecify;

		public String getPleaseSpecify() {
			return pleaseSpecify;
		}

		public void setPleaseSpecify(String pleaseSpecify) {
			this.pleaseSpecify = pleaseSpecify;
		}

	}
	//-----------------------------------com.langParser.Other__1.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Other__1 {

		@SerializedName("please_specify")
		@Expose
		private String pleaseSpecify;

		public String getPleaseSpecify() {
			return pleaseSpecify;
		}

		public void setPleaseSpecify(String pleaseSpecify) {
			this.pleaseSpecify = pleaseSpecify;
		}

	}
	//-----------------------------------com.langParser.Pacing.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Pacing {

		@SerializedName("self")
		@Expose
		private String self;
		@SerializedName("instructor")
		@Expose
		private String instructor;

		public String getSelf() {
			return self;
		}

		public void setSelf(String self) {
			this.self = self;
		}

		public String getInstructor() {
			return instructor;
		}

		public void setInstructor(String instructor) {
			this.instructor = instructor;
		}

	}
	//-----------------------------------com.langParser.Post.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Post {

		@SerializedName("all_responses")
		@Expose
		private String allResponses;

		public String getAllResponses() {
			return allResponses;
		}

		public void setAllResponses(String allResponses) {
			this.allResponses = allResponses;
		}

	}
	//-----------------------------------com.langParser.Privacy.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Privacy {

		@SerializedName("heading")
		@Expose
		private String heading;
		@SerializedName("subheading")
		@Expose
		private String subheading;

		public String getHeading() {
			return heading;
		}

		public void setHeading(String heading) {
			this.heading = heading;
		}

		public String getSubheading() {
			return subheading;
		}

		public void setSubheading(String subheading) {
			this.subheading = subheading;
		}

	}
	//-----------------------------------com.langParser.ReleaseDate.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class ReleaseDate {

		@SerializedName("1")
		@Expose
		private String _1;
		@SerializedName("2")
		@Expose
		private String _2;
		@SerializedName("3")
		@Expose
		private String _3;

		public String get1() {
			return _1;
		}

		public void set1(String _1) {
			this._1 = _1;
		}

		public String get2() {
			return _2;
		}

		public void set2(String _2) {
			this._2 = _2;
		}

		public String get3() {
			return _3;
		}

		public void set3(String _3) {
			this._3 = _3;
		}

	}
	//-----------------------------------com.langParser.RoleTenure.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class RoleTenure {

		@SerializedName("1")
		@Expose
		private String _1;
		@SerializedName("2")
		@Expose
		private String _2;
		@SerializedName("3")
		@Expose
		private String _3;
		@SerializedName("4")
		@Expose
		private String _4;
		@SerializedName("5")
		@Expose
		private String _5;
		@SerializedName("6")
		@Expose
		private String _6;

		public String get1() {
			return _1;
		}

		public void set1(String _1) {
			this._1 = _1;
		}

		public String get2() {
			return _2;
		}

		public void set2(String _2) {
			this._2 = _2;
		}

		public String get3() {
			return _3;
		}

		public void set3(String _3) {
			this._3 = _3;
		}

		public String get4() {
			return _4;
		}

		public void set4(String _4) {
			this._4 = _4;
		}

		public String get5() {
			return _5;
		}

		public void set5(String _5) {
			this._5 = _5;
		}

		public String get6() {
			return _6;
		}

		public void set6(String _6) {
			this._6 = _6;
		}

	}
	//-----------------------------------com.langParser.Search.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Search {

		@SerializedName("filter")
		@Expose
		private Filter filter;
		@SerializedName("tab")
		@Expose
		private Tab__2 tab;
		@SerializedName("empty")
		@Expose
		private Empty__3 empty;
		@SerializedName("hint")
		@Expose
		private String hint;

		public Filter getFilter() {
			return filter;
		}

		public void setFilter(Filter filter) {
			this.filter = filter;
		}

		public Tab__2 getTab() {
			return tab;
		}

		public void setTab(Tab__2 tab) {
			this.tab = tab;
		}

		public Empty__3 getEmpty() {
			return empty;
		}

		public void setEmpty(Empty__3 empty) {
			this.empty = empty;
		}

		public String getHint() {
			return hint;
		}

		public void setHint(String hint) {
			this.hint = hint;
		}

	}
	//-----------------------------------com.langParser.Section.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Section {

		@SerializedName("continue")
		@Expose
		private String _continue;
		@SerializedName("enrolled")
		@Expose
		private String enrolled;
		@SerializedName("saved")
		@Expose
		private String saved;
		@SerializedName("completed")
		@Expose
		private String completed;
		@SerializedName("recommended")
		@Expose
		private String recommended;

		public String getContinue() {
			return _continue;
		}

		public void setContinue(String _continue) {
			this._continue = _continue;
		}

		public String getEnrolled() {
			return enrolled;
		}

		public void setEnrolled(String enrolled) {
			this.enrolled = enrolled;
		}

		public String getSaved() {
			return saved;
		}

		public void setSaved(String saved) {
			this.saved = saved;
		}

		public String getCompleted() {
			return completed;
		}

		public void setCompleted(String completed) {
			this.completed = completed;
		}

		public String getRecommended() {
			return recommended;
		}

		public void setRecommended(String recommended) {
			this.recommended = recommended;
		}

	}
	//-----------------------------------com.langParser.SelfPaced.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class SelfPaced {

		@SerializedName("contents")
		@Expose
		private String contents;

		public String getContents() {
			return contents;
		}

		public void setContents(String contents) {
			this.contents = contents;
		}

	}
	//-----------------------------------com.langParser.Skills.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Skills {

		@SerializedName("heading")
		@Expose
		private String heading;
		@SerializedName("subheading")
		@Expose
		private String subheading;

		public String getHeading() {
			return heading;
		}

		public void setHeading(String heading) {
			this.heading = heading;
		}

		public String getSubheading() {
			return subheading;
		}

		public void setSubheading(String subheading) {
			this.subheading = subheading;
		}

	}
	//-----------------------------------com.langParser.Start.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Start {

		@SerializedName("title")
		@Expose
		private String title;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

	}
	//-----------------------------------com.langParser.StartLearning.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class StartLearning {

		@SerializedName("button")
		@Expose
		private String button;

		public String getButton() {
			return button;
		}

		public void setButton(String button) {
			this.button = button;
		}

	}
	//-----------------------------------com.langParser.Steps.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Steps {

		@SerializedName("general")
		@Expose
		private String general;
		@SerializedName("learning_goals")
		@Expose
		private String learningGoals;

		public String getGeneral() {
			return general;
		}

		public void setGeneral(String general) {
			this.general = general;
		}

		public String getLearningGoals() {
			return learningGoals;
		}

		public void setLearningGoals(String learningGoals) {
			this.learningGoals = learningGoals;
		}

	}
	//-----------------------------------com.langParser.StreamingQuality.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class StreamingQuality {

		@SerializedName("auto")
		@Expose
		private String auto;
		@SerializedName("low")
		@Expose
		private String low;
		@SerializedName("medium")
		@Expose
		private String medium;
		@SerializedName("high")
		@Expose
		private String high;

		public String getAuto() {
			return auto;
		}

		public void setAuto(String auto) {
			this.auto = auto;
		}

		public String getLow() {
			return low;
		}

		public void setLow(String low) {
			this.low = low;
		}

		public String getMedium() {
			return medium;
		}

		public void setMedium(String medium) {
			this.medium = medium;
		}

		public String getHigh() {
			return high;
		}

		public void setHigh(String high) {
			this.high = high;
		}

	}
	//-----------------------------------com.langParser.Success.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Success {

		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("microcredential")
		@Expose
		private Microcredential microcredential;
		@SerializedName("completed")
		@Expose
		private Completed__1 completed;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Microcredential getMicrocredential() {
			return microcredential;
		}

		public void setMicrocredential(Microcredential microcredential) {
			this.microcredential = microcredential;
		}

		public Completed__1 getCompleted() {
			return completed;
		}

		public void setCompleted(Completed__1 completed) {
			this.completed = completed;
		}

	}
	//-----------------------------------com.langParser.Tab.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Tab {

		@SerializedName("course_overview")
		@Expose
		private String courseOverview;
		@SerializedName("modules")
		@Expose
		private String modules;

		public String getCourseOverview() {
			return courseOverview;
		}

		public void setCourseOverview(String courseOverview) {
			this.courseOverview = courseOverview;
		}

		public String getModules() {
			return modules;
		}

		public void setModules(String modules) {
			this.modules = modules;
		}

	}
	//-----------------------------------com.langParser.Tab__1.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Tab__1 {

		@SerializedName("continue_learning")
		@Expose
		private String continueLearning;
		@SerializedName("recommendations")
		@Expose
		private String recommendations;
		@SerializedName("insights")
		@Expose
		private String insights;
		@SerializedName("wishlist")
		@Expose
		private String wishlist;
		@SerializedName("my_achievements")
		@Expose
		private String myAchievements;
		@SerializedName("completed")
		@Expose
		private String completed;

		public String getContinueLearning() {
			return continueLearning;
		}

		public void setContinueLearning(String continueLearning) {
			this.continueLearning = continueLearning;
		}

		public String getRecommendations() {
			return recommendations;
		}

		public void setRecommendations(String recommendations) {
			this.recommendations = recommendations;
		}

		public String getInsights() {
			return insights;
		}

		public void setInsights(String insights) {
			this.insights = insights;
		}

		public String getWishlist() {
			return wishlist;
		}

		public void setWishlist(String wishlist) {
			this.wishlist = wishlist;
		}

		public String getMyAchievements() {
			return myAchievements;
		}

		public void setMyAchievements(String myAchievements) {
			this.myAchievements = myAchievements;
		}

		public String getCompleted() {
			return completed;
		}

		public void setCompleted(String completed) {
			this.completed = completed;
		}

	}
	//-----------------------------------com.langParser.Tab__2.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Tab__2 {

		@SerializedName("learning_programs")
		@Expose
		private String learningPrograms;
		@SerializedName("modules")
		@Expose
		private String modules;

		public String getLearningPrograms() {
			return learningPrograms;
		}

		public void setLearningPrograms(String learningPrograms) {
			this.learningPrograms = learningPrograms;
		}

		public String getModules() {
			return modules;
		}

		public void setModules(String modules) {
			this.modules = modules;
		}

	}
	//-----------------------------------com.langParser.Unenroll.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Unenroll {

		@SerializedName("alert")
		@Expose
		private Alert alert;
		@SerializedName("title")
		@Expose
		private String title;

		public Alert getAlert() {
			return alert;
		}

		public void setAlert(Alert alert) {
			this.alert = alert;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

	}
	//-----------------------------------com.langParser.Unit.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Unit {

		@SerializedName("empty")
		@Expose
		private Empty__5 empty;

		public Empty__5 getEmpty() {
			return empty;
		}

		public void setEmpty(Empty__5 empty) {
			this.empty = empty;
		}

	}
	//-----------------------------------com.langParser.UpcomingEvents.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class UpcomingEvents {

		@SerializedName("title")
		@Expose
		private String title;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

	}
	//-----------------------------------com.langParser.Vle.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Vle {

		@SerializedName("next")
		@Expose
		private String next;
		@SerializedName("previous")
		@Expose
		private String previous;
		@SerializedName("not_enrolled")
		@Expose
		private String notEnrolled;
		@SerializedName("next_module")
		@Expose
		private String nextModule;
		@SerializedName("finish")
		@Expose
		private String finish;
		@SerializedName("exit_course")
		@Expose
		private String exitCourse;
		@SerializedName("success")
		@Expose
		private Success success;
		@SerializedName("previous_module")
		@Expose
		private String previousModule;
		@SerializedName("unit")
		@Expose
		private Unit unit;
		@SerializedName("reader_view")
		@Expose
		private String readerView;
		@SerializedName("default_view")
		@Expose
		private String defaultView;
		@SerializedName("course_exit")
		@Expose
		private String courseExit;
		@SerializedName("error")
		@Expose
		private Error__1 error;
		@SerializedName("next_chapter")
		@Expose
		private String nextChapter;
		@SerializedName("previous_chapter")
		@Expose
		private String previousChapter;

		public String getNext() {
			return next;
		}

		public void setNext(String next) {
			this.next = next;
		}

		public String getPrevious() {
			return previous;
		}

		public void setPrevious(String previous) {
			this.previous = previous;
		}

		public String getNotEnrolled() {
			return notEnrolled;
		}

		public void setNotEnrolled(String notEnrolled) {
			this.notEnrolled = notEnrolled;
		}

		public String getNextModule() {
			return nextModule;
		}

		public void setNextModule(String nextModule) {
			this.nextModule = nextModule;
		}

		public String getFinish() {
			return finish;
		}

		public void setFinish(String finish) {
			this.finish = finish;
		}

		public String getExitCourse() {
			return exitCourse;
		}

		public void setExitCourse(String exitCourse) {
			this.exitCourse = exitCourse;
		}

		public Success getSuccess() {
			return success;
		}

		public void setSuccess(Success success) {
			this.success = success;
		}

		public String getPreviousModule() {
			return previousModule;
		}

		public void setPreviousModule(String previousModule) {
			this.previousModule = previousModule;
		}

		public Unit getUnit() {
			return unit;
		}

		public void setUnit(Unit unit) {
			this.unit = unit;
		}

		public String getReaderView() {
			return readerView;
		}

		public void setReaderView(String readerView) {
			this.readerView = readerView;
		}

		public String getDefaultView() {
			return defaultView;
		}

		public void setDefaultView(String defaultView) {
			this.defaultView = defaultView;
		}

		public String getCourseExit() {
			return courseExit;
		}

		public void setCourseExit(String courseExit) {
			this.courseExit = courseExit;
		}

		public Error__1 getError() {
			return error;
		}

		public void setError(Error__1 error) {
			this.error = error;
		}

		public String getNextChapter() {
			return nextChapter;
		}

		public void setNextChapter(String nextChapter) {
			this.nextChapter = nextChapter;
		}

		public String getPreviousChapter() {
			return previousChapter;
		}

		public void setPreviousChapter(String previousChapter) {
			this.previousChapter = previousChapter;
		}

	}
	//-----------------------------------com.langParser.Welcome.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Welcome {

		@SerializedName("welcome_name")
		@Expose
		private String welcomeName;
		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("subtitle")
		@Expose
		private String subtitle;

		public String getWelcomeName() {
			return welcomeName;
		}

		public void setWelcomeName(String welcomeName) {
			this.welcomeName = welcomeName;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getSubtitle() {
			return subtitle;
		}

		public void setSubtitle(String subtitle) {
			this.subtitle = subtitle;
		}

	}
	//-----------------------------------com.langParser.Welcome__1.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class Welcome__1 {

		@SerializedName("start_learning")
		@Expose
		private StartLearning startLearning;
		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("subtitle")
		@Expose
		private String subtitle;
		@SerializedName("footer")
		@Expose
		private String footer;

		public StartLearning getStartLearning() {
			return startLearning;
		}

		public void setStartLearning(StartLearning startLearning) {
			this.startLearning = startLearning;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getSubtitle() {
			return subtitle;
		}

		public void setSubtitle(String subtitle) {
			this.subtitle = subtitle;
		}

		public String getFooter() {
			return footer;
		}

		public void setFooter(String footer) {
			this.footer = footer;
		}

	}
	//-----------------------------------com.langParser.ZoomNotInstalled.java-----------------------------------







	//@Generated("jsonschema2pojo")
	public class ZoomNotInstalled {

		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("message")
		@Expose
		private String message;
		@SerializedName("button")
		@Expose
		private Button button;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Button getButton() {
			return button;
		}

		public void setButton(Button button) {
			this.button = button;
		}

	}
	public class jsonObjectReader {

	}

}