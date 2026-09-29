package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public interface CourseConfigV2NavDrawerItemAddVideo<R, D> {
    R AudioAttributesCompatParcelizer(CourseConfigV2TestTabItem courseConfigV2TestTabItem, D d);

    R AudioAttributesCompatParcelizer(getTopSection gettopsection, D d);

    R IconCompatParcelizer(CourseConfigV2GtAnalyticsCard courseConfigV2GtAnalyticsCard, D d);

    R IconCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, D d);

    R RemoteActionCompatParcelizer(CourseConfigV2SearchItem courseConfigV2SearchItem, D d);

    R RemoteActionCompatParcelizer(CourseConfigV2VideoProperties courseConfigV2VideoProperties, D d);

    R RemoteActionCompatParcelizer(getAppSettings getappsettings, D d);

    R RemoteActionCompatParcelizer(getShouldShowEmptyPlanScreen getshouldshowemptyplanscreen, D d);

    R read(CourseConfigV2SettingsItems courseConfigV2SettingsItems, D d);

    R read(getBadgeText getbadgetext, D d);

    R write(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, D d);

    R write(CourseConfigV2TestItem courseConfigV2TestItem, D d);

    R write(getMeta getmeta, D d);
}
