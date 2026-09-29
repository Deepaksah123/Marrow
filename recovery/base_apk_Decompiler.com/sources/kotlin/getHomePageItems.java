package kotlin;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getHomePageItems {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends Member> getDefaultBottomTab<M> IconCompatParcelizer(getDefaultBottomTab<? extends M> getdefaultbottomtab, getTestHeaderTitle gettestheadertitle, boolean z) {
        getLink getlinkAudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.write(getdefaultbottomtab, "");
        toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
        if (!getOption3.write((getVideoPageNotesTitle) gettestheadertitle)) {
            List<getMeta> listAX_ = gettestheadertitle.aX_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
            List<getMeta> list = listAX_;
            if ((list instanceof Collection) && list.isEmpty()) {
                getlinkAudioAttributesImplBaseParcelizer = gettestheadertitle.AudioAttributesImplBaseParcelizer();
                return getlinkAudioAttributesImplBaseParcelizer != null ? getdefaultbottomtab : getdefaultbottomtab;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                getLink getlinkOnPrepareFromMediaId = ((getMeta) it.next()).onPrepareFromMediaId();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
                if (getOption3.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId)) {
                    break;
                }
            }
            getlinkAudioAttributesImplBaseParcelizer = gettestheadertitle.AudioAttributesImplBaseParcelizer();
            if ((getlinkAudioAttributesImplBaseParcelizer != null || !getOption3.AudioAttributesCompatParcelizer(getlinkAudioAttributesImplBaseParcelizer)) && ((getdefaultbottomtab instanceof getEditionSwitch) || !RemoteActionCompatParcelizer(gettestheadertitle))) {
            }
        }
        return new getNavDrawerItems(gettestheadertitle, getdefaultbottomtab, z);
    }

    private static final boolean RemoteActionCompatParcelizer(getTestHeaderTitle gettestheadertitle) {
        getLink getlinkAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(gettestheadertitle);
        return getlinkAudioAttributesCompatParcelizer != null && getOption3.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer);
    }

    public static final Method write(Class<?> cls, getTestHeaderTitle gettestheadertitle) {
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredMethod, "");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            StringBuilder sb = new StringBuilder("No unbox method found in inline class: ");
            sb.append(cls);
            sb.append(" (calling ");
            sb.append(gettestheadertitle);
            sb.append(')');
            throw new component28(sb.toString());
        }
    }

    public static final Method RemoteActionCompatParcelizer(Class<?> cls, getTestHeaderTitle gettestheadertitle) {
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", write(cls, gettestheadertitle).getReturnType());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredMethod, "");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            StringBuilder sb = new StringBuilder("No box method found in inline class: ");
            sb.append(cls);
            sb.append(" (calling ");
            sb.append(gettestheadertitle);
            sb.append(')');
            throw new component28(sb.toString());
        }
    }

    public static final Class<?> RemoteActionCompatParcelizer(getLink getlink) {
        getLink getlink2;
        toMagicModuleMetaRepoModel.write(getlink, "");
        Class<?> clsIconCompatParcelizer = IconCompatParcelizer(getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer());
        if (clsIconCompatParcelizer == null) {
            return null;
        }
        if (setPlanAddOns.write(getlink) && ((getlink2 = getOption3.read(getlink)) == null || setPlanAddOns.write(getlink2) || getTestTabItems.AudioAttributesImplBaseParcelizer(getlink2))) {
            return null;
        }
        return clsIconCompatParcelizer;
    }

    public static final Class<?> IconCompatParcelizer(getVariant getvariant) {
        if (!(getvariant instanceof CourseConfigV2CustomModuleQuestionSource) || !getOption3.IconCompatParcelizer(getvariant)) {
            return null;
        }
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = (CourseConfigV2CustomModuleQuestionSource) getvariant;
        Class<?> clsAudioAttributesCompatParcelizer = getCourseStrings.AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSource);
        if (clsAudioAttributesCompatParcelizer != null) {
            return clsAudioAttributesCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder("Class object for the class ");
        sb.append(courseConfigV2CustomModuleQuestionSource.aQ_());
        sb.append(" cannot be found (classId=");
        sb.append(setLocked.read((getQuestionLimit) getvariant));
        sb.append(')');
        throw new component28(sb.toString());
    }

    private static final getLink AudioAttributesCompatParcelizer(getTestHeaderTitle gettestheadertitle) {
        CourseConfigV2TestTabItem courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver = gettestheadertitle.MediaBrowserCompatCustomActionResultReceiver();
        CourseConfigV2TestTabItem courseConfigV2TestTabItemWrite = gettestheadertitle.write();
        if (courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver != null) {
            return courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver.onPrepareFromMediaId();
        }
        if (courseConfigV2TestTabItemWrite == null) {
            return null;
        }
        if (gettestheadertitle instanceof CourseConfigV2GtAnalyticsCard) {
            return courseConfigV2TestTabItemWrite.onPrepareFromMediaId();
        }
        getVariant getvariantAudioAttributesImplApi21Parcelizer = gettestheadertitle.onPlayFromMediaId();
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = getvariantAudioAttributesImplApi21Parcelizer instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getvariantAudioAttributesImplApi21Parcelizer : null;
        return courseConfigV2CustomModuleQuestionSource != null ? courseConfigV2CustomModuleQuestionSource.aP_() : null;
    }

    public static final Object IconCompatParcelizer(Object obj, getTestHeaderTitle gettestheadertitle) {
        getLink getlinkAudioAttributesCompatParcelizer;
        Class<?> clsRemoteActionCompatParcelizer;
        Method methodWrite;
        toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
        return (((gettestheadertitle instanceof CourseConfigV2SettingsItems) && getOption3.RemoteActionCompatParcelizer((Editor) gettestheadertitle)) || (getlinkAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(gettestheadertitle)) == null || (clsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getlinkAudioAttributesCompatParcelizer)) == null || (methodWrite = write(clsRemoteActionCompatParcelizer, gettestheadertitle)) == null) ? obj : methodWrite.invoke(obj, new Object[0]);
    }
}
