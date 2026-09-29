package kotlin;

/* JADX INFO: loaded from: classes.dex */
public interface CourseConfigV2NavDrawerItemYourCourse extends CourseConfigV2NavDrawerItemAboutUs, getSubText {
    CourseConfigV2NavDrawerItems MediaBrowserCompatMediaItem();

    boolean onCommand();

    @Override // kotlin.getSubText
    CourseConfigV2NavDrawerItemFreeExtension onCustomAction();

    boolean onMediaButtonEvent();

    boolean onPause();
}
