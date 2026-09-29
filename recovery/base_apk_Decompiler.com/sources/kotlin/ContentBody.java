package kotlin;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.getVideoPageNotesTitle;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ContentBody extends PresenterBundle implements Editor {
    private getLink AudioAttributesCompatParcelizer;

    @Override // kotlin.getVideoPageNotesTitle
    public <V> V IconCompatParcelizer(getVideoPageNotesTitle.RemoteActionCompatParcelizer<V> remoteActionCompatParcelizer) {
        return null;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public CourseConfigV2TestTabItem MediaBrowserCompatCustomActionResultReceiver() {
        return null;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public boolean MediaBrowserCompatSearchResultReceiver() {
        return false;
    }

    @Override // kotlin.Editor
    public boolean onPlayFromUri() {
        return false;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public CourseConfigV2TestTabItem write() {
        return null;
    }

    @Override // kotlin.CourseConfigV2VideoItem
    public /* synthetic */ CourseConfigV2NavDrawerItemAboutUs write(setDesriptionList setdesriptionlist) {
        return RemoteActionCompatParcelizer(setdesriptionlist);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentBody(getVariant getvariant, getQuote getquote, getRelatedLessonId getrelatedlessonid, getLink getlink, getIntroDurationSeconds getintrodurationseconds) {
        super(getvariant, getquote, getrelatedlessonid, getintrodurationseconds);
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(0);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(1);
        }
        if (getrelatedlessonid == null) {
            AudioAttributesCompatParcelizer(2);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(3);
        }
        this.AudioAttributesCompatParcelizer = getlink;
    }

    @Override // kotlin.getLinkedGroupIds
    public final getLink onPrepareFromMediaId() {
        getLink getlink = this.AudioAttributesCompatParcelizer;
        if (getlink == null) {
            AudioAttributesCompatParcelizer(4);
        }
        return getlink;
    }

    public final void IconCompatParcelizer(getLink getlink) {
        this.AudioAttributesCompatParcelizer = getlink;
    }

    @Override // kotlin.PresenterBundle, kotlin.getBooleanMap, kotlin.getVariant
    /* JADX INFO: renamed from: onPrepareFromUri, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Editor onAddQueueItem() {
        Editor editor = (Editor) super.aS_();
        if (editor == null) {
            AudioAttributesCompatParcelizer(5);
        }
        return editor;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final List<getMeta> aX_() {
        List<getMeta> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            AudioAttributesCompatParcelizer(6);
        }
        return listEmptyList;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public Collection<? extends getVideoPageNotesTitle> AudioAttributesImplApi26Parcelizer() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            AudioAttributesCompatParcelizer(7);
        }
        return setEmptySet;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public List<getBadgeText> MediaDescriptionCompat() {
        List<getBadgeText> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            AudioAttributesCompatParcelizer(8);
        }
        return listEmptyList;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public List<CourseConfigV2TestTabItem> read() {
        List<CourseConfigV2TestTabItem> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            AudioAttributesCompatParcelizer(9);
        }
        return listEmptyList;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public getLink AudioAttributesImplBaseParcelizer() {
        getLink getlinkOnPrepareFromMediaId = onPrepareFromMediaId();
        if (getlinkOnPrepareFromMediaId == null) {
            AudioAttributesCompatParcelizer(10);
        }
        return getlinkOnPrepareFromMediaId;
    }

    private static /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }
}
