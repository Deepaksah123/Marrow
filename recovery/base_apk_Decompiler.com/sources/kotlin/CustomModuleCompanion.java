package kotlin;

import java.util.List;
import kotlin.getQuote;
import kotlin.getTestHeaderTitle;
import kotlin.getVideoPageNotesTitle;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomModuleCompanion extends NetworkStat implements setExpiredOn {
    private Boolean IconCompatParcelizer;
    private Boolean read;

    @Override // kotlin.setExpiredOn
    public final /* synthetic */ setExpiredOn AudioAttributesCompatParcelizer(getLink getlink, List list, getLink getlink2, Pair pair) {
        return write(getlink, (List<getLink>) list, getlink2, (Pair<getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, ?>) pair);
    }

    @Override // kotlin.NetworkStat, kotlin.getIntegerMap
    public final /* synthetic */ getIntegerMap read(getVariant getvariant, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getRelatedLessonId getrelatedlessonid, getQuote getquote, getIntroDurationSeconds getintrodurationseconds) {
        return write(getvariant, courseConfigV2NavDrawerItemRateUs, remoteActionCompatParcelizer, getquote, getintrodurationseconds);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private CustomModuleCompanion(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, CustomModuleCompanion customModuleCompanion, getQuote getquote, boolean z, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getIntroDurationSeconds getintrodurationseconds) {
        super(courseConfigV2CustomModuleQuestionSource, customModuleCompanion, getquote, z, remoteActionCompatParcelizer, getintrodurationseconds);
        if (courseConfigV2CustomModuleQuestionSource == null) {
            AudioAttributesCompatParcelizer(0);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(1);
        }
        if (remoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(2);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(3);
        }
        this.read = null;
        this.IconCompatParcelizer = null;
    }

    public static CustomModuleCompanion read(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, getQuote getquote, boolean z, getIntroDurationSeconds getintrodurationseconds) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            AudioAttributesCompatParcelizer(4);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(5);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(6);
        }
        return new CustomModuleCompanion(courseConfigV2CustomModuleQuestionSource, null, getquote, z, getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION, getintrodurationseconds);
    }

    @Override // kotlin.getIntegerMap
    public final boolean onRewind() {
        return this.read.booleanValue();
    }

    @Override // kotlin.getIntegerMap
    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.read = Boolean.valueOf(z);
    }

    @Override // kotlin.getIntegerMap, kotlin.getVideoPageNotesTitle
    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.IconCompatParcelizer.booleanValue();
    }

    @Override // kotlin.getIntegerMap
    public final void write(boolean z) {
        this.IconCompatParcelizer = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.NetworkStat
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public CustomModuleCompanion write(getVariant getvariant, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getQuote getquote, getIntroDurationSeconds getintrodurationseconds) {
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(7);
        }
        if (remoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(8);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(9);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(10);
        }
        if (remoteActionCompatParcelizer != getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION && remoteActionCompatParcelizer != getTestHeaderTitle.RemoteActionCompatParcelizer.SYNTHESIZED) {
            StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
            sb.append(this);
            sb.append("\nnewOwner: ");
            sb.append(getvariant);
            sb.append("\nkind: ");
            sb.append(remoteActionCompatParcelizer);
            throw new IllegalStateException(sb.toString());
        }
        CustomModuleCompanion customModuleCompanion = read((CourseConfigV2CustomModuleQuestionSource) getvariant, (CustomModuleCompanion) courseConfigV2NavDrawerItemRateUs, remoteActionCompatParcelizer, getintrodurationseconds, getquote);
        customModuleCompanion.AudioAttributesCompatParcelizer(onRewind());
        customModuleCompanion.write(MediaBrowserCompatSearchResultReceiver());
        return customModuleCompanion;
    }

    private CustomModuleCompanion read(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, CustomModuleCompanion customModuleCompanion, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getIntroDurationSeconds getintrodurationseconds, getQuote getquote) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            AudioAttributesCompatParcelizer(12);
        }
        if (remoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(13);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(14);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(15);
        }
        return new CustomModuleCompanion(courseConfigV2CustomModuleQuestionSource, customModuleCompanion, getquote, ((NetworkStat) this).write, remoteActionCompatParcelizer, getintrodurationseconds);
    }

    private CustomModuleCompanion write(getLink getlink, List<getLink> list, getLink getlink2, Pair<getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, ?> pair) {
        CourseConfigV2TestTabItem courseConfigV2TestTabItemAudioAttributesCompatParcelizer;
        if (list == null) {
            AudioAttributesCompatParcelizer(16);
        }
        if (getlink2 == null) {
            AudioAttributesCompatParcelizer(17);
        }
        CustomModuleCompanion customModuleCompanionWrite = write(AudioAttributesImplApi21Parcelizer(), (CourseConfigV2NavDrawerItemRateUs) null, handleMediaPlayPauseIfPendingOnHandler(), RemoteActionCompatParcelizer(), RatingCompat());
        if (getlink == null) {
            courseConfigV2TestTabItemAudioAttributesCompatParcelizer = null;
        } else {
            getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
            courseConfigV2TestTabItemAudioAttributesCompatParcelizer = getOption2.AudioAttributesCompatParcelizer(customModuleCompanionWrite, getlink, getQuote.AudioAttributesCompatParcelizer.read());
        }
        customModuleCompanionWrite.read(courseConfigV2TestTabItemAudioAttributesCompatParcelizer, write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), MediaDescriptionCompat(), getIncludeUntagged.read(list, aX_(), customModuleCompanionWrite), getlink2, MediaBrowserCompatMediaItem(), onCustomAction());
        if (pair != null) {
            customModuleCompanionWrite.AudioAttributesCompatParcelizer(pair.write(), pair.IconCompatParcelizer());
        }
        if (customModuleCompanionWrite == null) {
            AudioAttributesCompatParcelizer(18);
        }
        return customModuleCompanionWrite;
    }

    private static /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
