package core.Utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import core.Utils.LangParser.Account;
import core.Utils.LangParser.Age;
import core.Utils.LangParser.Completed;
import core.Utils.LangParser.ContinueLearning;
import core.Utils.LangParser.ContinueLearning__1;
import core.Utils.LangParser.CourseDuration;
import core.Utils.LangParser.CurrentRoleDuration;
import core.Utils.LangParser.DeletePicture;
import core.Utils.LangParser.Details;
import core.Utils.LangParser.Education;
import core.Utils.LangParser.Error;
import core.Utils.LangParser.Feedback;
import core.Utils.LangParser.Gender;
import core.Utils.LangParser.Gender__1;
import core.Utils.LangParser.GetStarted;
import core.Utils.LangParser.Goals;
import core.Utils.LangParser.Goals__1;
import core.Utils.LangParser.Interests;
import core.Utils.LangParser.Job;
import core.Utils.LangParser.Language;
import core.Utils.LangParser.Language__1;
import core.Utils.LangParser.Location;
import core.Utils.LangParser.LogOut;
import core.Utils.LangParser.Menu;
import core.Utils.LangParser.Pacing;
import core.Utils.LangParser.Privacy;
import core.Utils.LangParser.ReleaseDate;
import core.Utils.LangParser.RoleTenure;
import core.Utils.LangParser.Section;
import core.Utils.LangParser.Skills;
import core.Utils.LangParser.StartLearning;
import core.Utils.LangParser.Steps;
import core.Utils.LangParser.StreamingQuality;
import core.Utils.LangParser.Tab__1;
import core.Utils.LangParser.UpcomingEvents;

public class LangParserNew {



	//Start of parser for Welcome***********************************************
	//Below is for Welcome header 13 in number
	@SerializedName("welcome")
	@Expose
	private Welcome welcome;

	//Getter-setter classes for welcome
	public Welcome getWelcome() {
		return welcome;
	}
	public void setWelcome(Welcome welcome) {
		this.welcome = welcome;
	}

	//@Generated("jsonschema2pojo") - classes created for children of Welcome
	public class Welcome {

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

		//Getter-setter classes for welcome - Children
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
	//End of parser for Welcome***********************************************






	//Start of parser for General***********************************************
	@SerializedName("general")
	@Expose
	private General general;

	//Getter-setter classes for general
	public General getGeneral() {
		return general;
	}
	public void setGeneral(General general) {
		this.general = general;
	}

	//@Generated("jsonschema2pojo")- classes created for children of General
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
	//End of parser for General***********************************************







	//Start of parser for Dashboard***********************************************
	@SerializedName("dashboard")
	@Expose
	private Dashboard dashboard;

	//Getter-setter classes for Dashboard
	public Dashboard getDashboard() {
		return dashboard;
	}
	public void setDashboard(Dashboard dashboard) {
		this.dashboard = dashboard;
	}

	//@Generated("jsonschema2pojo")- classes created for children of Dashboard
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
	//End of parser for Dashboard***********************************************






	//Start of parser for Data***********************************************
	@SerializedName("data")
	@Expose
	private Data data;

	//Getter-setter classes for Data
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}

	//@Generated("jsonschema2pojo")- classes created for children of Data
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
	//End of parser for Data***********************************************







	//Start of parser for Onboarding***********************************************
	@SerializedName("onboarding")
	@Expose
	private Onboarding onboarding;

	//Getter-setter classes for Onboarding
	public Onboarding getOnboarding() {
		return onboarding;
	}
	public void setOnboarding(Onboarding onboarding) {
		this.onboarding = onboarding;
	}

	//@Generated("jsonschema2pojo")- classes created for children of Onboarding
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

	//End of parser for Onboarding***********************************************






	//Start of parser for My learning***********************************************
	@SerializedName("my_learning")
	@Expose
	private MyLearning myLearning;

	//Getter-setter classes for My learning
	public MyLearning getMyLearning() {
		return myLearning;
	}
	public void setMyLearning(MyLearning myLearning) {
		this.myLearning = myLearning;
	}


	//@Generated("jsonschema2pojo")- classes created for children of My learning
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

	//End of parser for My learning***********************************************



	
	

	
	


	//Start of parser for My Profile***********************************************
	@SerializedName("my_profile")
	@Expose
	private MyProfile myProfile;

	//Getter-setter classes for My Profile
	public MyProfile getMyProfile() {
		return myProfile;
	}
	public void setMyProfile(MyProfile myProfile) {
		this.myProfile = myProfile;
	}

	//@Generated("jsonschema2pojo")- classes created for children of My Profile
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


	//End of parser for My Profile***********************************************

}
