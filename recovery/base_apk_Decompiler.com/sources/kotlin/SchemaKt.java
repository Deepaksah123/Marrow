package kotlin;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.getTestHeaderTitle;

/* JADX INFO: loaded from: classes4.dex */
public final class SchemaKt extends getExamName implements CourseConfigV2TestItem {
    private getLink AudioAttributesCompatParcelizer;
    private final CourseConfigV2TestItem read;

    /* JADX WARN: Multi-variable type inference failed */
    public SchemaKt(CourseConfigV2SettingsItems courseConfigV2SettingsItems, getQuote getquote, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, boolean z, boolean z2, boolean z3, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, CourseConfigV2TestItem courseConfigV2TestItem, getIntroDurationSeconds getintrodurationseconds) {
        SchemaKt schemaKt;
        CourseConfigV2TestItem courseConfigV2TestItem2;
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
        StringBuilder sb = new StringBuilder("<get-");
        sb.append(courseConfigV2SettingsItems.aQ_());
        sb.append(">");
        super(courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, courseConfigV2SettingsItems, getquote, getRelatedLessonId.AudioAttributesCompatParcelizer(sb.toString()), z, z2, z3, remoteActionCompatParcelizer, getintrodurationseconds);
        if (courseConfigV2TestItem == null) {
            courseConfigV2TestItem2 = this;
            schemaKt = courseConfigV2TestItem2;
        } else {
            schemaKt = this;
            courseConfigV2TestItem2 = courseConfigV2TestItem;
        }
        schemaKt.read = courseConfigV2TestItem2;
    }

    public final void write(getLink getlink) {
        if (getlink == null) {
            getlink = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPrepareFromMediaId();
        }
        this.AudioAttributesCompatParcelizer = getlink;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemRateUs, kotlin.getTestHeaderTitle, kotlin.getVideoPageNotesTitle
    public final Collection<? extends CourseConfigV2TestItem> AudioAttributesImplApi26Parcelizer() {
        return super.AudioAttributesCompatParcelizer(true);
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final List<getMeta> aX_() {
        List<getMeta> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            RemoteActionCompatParcelizer(7);
        }
        return listEmptyList;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final getLink AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getVariant
    public final <R, D> R AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemAddVideo<R, D> courseConfigV2NavDrawerItemAddVideo, D d) {
        return courseConfigV2NavDrawerItemAddVideo.write(this, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getExamName, kotlin.CourseConfigV2NavDrawerItemRateUs
    /* JADX INFO: renamed from: onRewind, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CourseConfigV2TestItem onPrepareFromMediaId() {
        CourseConfigV2TestItem courseConfigV2TestItem = this.read;
        if (courseConfigV2TestItem == null) {
            RemoteActionCompatParcelizer(8);
        }
        return courseConfigV2TestItem;
    }

    private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
