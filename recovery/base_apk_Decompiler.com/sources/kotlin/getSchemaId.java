package kotlin;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.getTestHeaderTitle;

/* JADX INFO: loaded from: classes4.dex */
public final class getSchemaId extends getExamName implements getAppSettings {
    private getMeta AudioAttributesCompatParcelizer;
    private final getAppSettings IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public getSchemaId(CourseConfigV2SettingsItems courseConfigV2SettingsItems, getQuote getquote, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, boolean z, boolean z2, boolean z3, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getAppSettings getappsettings, getIntroDurationSeconds getintrodurationseconds) {
        getSchemaId getschemaid;
        getAppSettings getappsettings2;
        if (courseConfigV2SettingsItems == null) {
            RemoteActionCompatParcelizer(0);
        }
        if (getquote == null) {
            RemoteActionCompatParcelizer(1);
        }
        if (courseConfigV2NavDrawerItems == null) {
            RemoteActionCompatParcelizer(2);
        }
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            RemoteActionCompatParcelizer(3);
        }
        if (remoteActionCompatParcelizer == null) {
            RemoteActionCompatParcelizer(4);
        }
        if (getintrodurationseconds == null) {
            RemoteActionCompatParcelizer(5);
        }
        StringBuilder sb = new StringBuilder("<set-");
        sb.append(courseConfigV2SettingsItems.aQ_());
        sb.append(">");
        super(courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, courseConfigV2SettingsItems, getquote, getRelatedLessonId.AudioAttributesCompatParcelizer(sb.toString()), z, z2, z3, remoteActionCompatParcelizer, getintrodurationseconds);
        if (getappsettings == null) {
            getappsettings2 = this;
            getschemaid = getappsettings2;
        } else {
            getschemaid = this;
            getappsettings2 = getappsettings;
        }
        getschemaid.IconCompatParcelizer = getappsettings2;
    }

    public final void IconCompatParcelizer(getMeta getmeta) {
        if (getmeta == null) {
            RemoteActionCompatParcelizer(6);
        }
        this.AudioAttributesCompatParcelizer = getmeta;
    }

    public static getLastHtmlBody AudioAttributesCompatParcelizer(getAppSettings getappsettings, getLink getlink, getQuote getquote) {
        if (getappsettings == null) {
            RemoteActionCompatParcelizer(7);
        }
        if (getlink == null) {
            RemoteActionCompatParcelizer(8);
        }
        if (getquote == null) {
            RemoteActionCompatParcelizer(9);
        }
        return new getLastHtmlBody(getappsettings, null, 0, getquote, getVideoMetaEncrypt.IconCompatParcelizer, getlink, false, false, false, null, getIntroDurationSeconds.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemRateUs, kotlin.getTestHeaderTitle, kotlin.getVideoPageNotesTitle
    public final Collection<? extends getAppSettings> AudioAttributesImplApi26Parcelizer() {
        return super.AudioAttributesCompatParcelizer(false);
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final List<getMeta> aX_() {
        getMeta getmeta = this.AudioAttributesCompatParcelizer;
        if (getmeta == null) {
            throw new IllegalStateException();
        }
        List<getMeta> listSingletonList = Collections.singletonList(getmeta);
        if (listSingletonList == null) {
            RemoteActionCompatParcelizer(11);
        }
        return listSingletonList;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final getLink AudioAttributesImplBaseParcelizer() {
        getHref gethrefOnPrepare = setLocked.AudioAttributesCompatParcelizer((getVariant) this).onPrepare();
        if (gethrefOnPrepare == null) {
            RemoteActionCompatParcelizer(12);
        }
        return gethrefOnPrepare;
    }

    @Override // kotlin.getVariant
    public final <R, D> R AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemAddVideo<R, D> courseConfigV2NavDrawerItemAddVideo, D d) {
        return courseConfigV2NavDrawerItemAddVideo.RemoteActionCompatParcelizer(this, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getExamName, kotlin.CourseConfigV2NavDrawerItemRateUs
    /* JADX INFO: renamed from: onRewind, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public getAppSettings onPrepareFromMediaId() {
        getAppSettings getappsettings = this.IconCompatParcelizer;
        if (getappsettings == null) {
            RemoteActionCompatParcelizer(13);
        }
        return getappsettings;
    }

    private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }
}
