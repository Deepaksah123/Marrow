package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collections;
import java.util.List;
import kotlin.getGroupDescription;
import kotlin.getQuote;
import kotlin.getTestHeaderTitle;

/* JADX INFO: loaded from: classes4.dex */
public final class getOption2 {

    static class RemoteActionCompatParcelizer extends NetworkStat {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, getIntroDurationSeconds getintrodurationseconds) {
            super(courseConfigV2CustomModuleQuestionSource, null, getQuote.AudioAttributesCompatParcelizer.read(), true, getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION, getintrodurationseconds);
            if (courseConfigV2CustomModuleQuestionSource == null) {
                RemoteActionCompatParcelizer(0);
            }
            if (getintrodurationseconds == null) {
                RemoteActionCompatParcelizer(1);
            }
            getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
            read(Collections.emptyList(), getAnswerDescription.IconCompatParcelizer(courseConfigV2CustomModuleQuestionSource, false));
        }

        private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public static getSchemaId AudioAttributesCompatParcelizer(CourseConfigV2SettingsItems courseConfigV2SettingsItems, getQuote getquote, getQuote getquote2) {
        if (courseConfigV2SettingsItems == null) {
            RemoteActionCompatParcelizer(0);
        }
        if (getquote == null) {
            RemoteActionCompatParcelizer(1);
        }
        if (getquote2 == null) {
            RemoteActionCompatParcelizer(2);
        }
        return IconCompatParcelizer(courseConfigV2SettingsItems, getquote, getquote2, courseConfigV2SettingsItems.RatingCompat());
    }

    private static getSchemaId IconCompatParcelizer(CourseConfigV2SettingsItems courseConfigV2SettingsItems, getQuote getquote, getQuote getquote2, getIntroDurationSeconds getintrodurationseconds) {
        if (courseConfigV2SettingsItems == null) {
            RemoteActionCompatParcelizer(3);
        }
        if (getquote == null) {
            RemoteActionCompatParcelizer(4);
        }
        if (getquote2 == null) {
            RemoteActionCompatParcelizer(5);
        }
        if (getintrodurationseconds == null) {
            RemoteActionCompatParcelizer(6);
        }
        return IconCompatParcelizer(courseConfigV2SettingsItems, getquote, getquote2, true, false, false, courseConfigV2SettingsItems.onCustomAction(), getintrodurationseconds);
    }

    public static getSchemaId IconCompatParcelizer(CourseConfigV2SettingsItems courseConfigV2SettingsItems, getQuote getquote, getQuote getquote2, boolean z, boolean z2, boolean z3, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, getIntroDurationSeconds getintrodurationseconds) {
        if (courseConfigV2SettingsItems == null) {
            RemoteActionCompatParcelizer(7);
        }
        if (getquote == null) {
            RemoteActionCompatParcelizer(8);
        }
        if (getquote2 == null) {
            RemoteActionCompatParcelizer(9);
        }
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            RemoteActionCompatParcelizer(10);
        }
        if (getintrodurationseconds == null) {
            RemoteActionCompatParcelizer(11);
        }
        getSchemaId getschemaid = new getSchemaId(courseConfigV2SettingsItems, getquote, courseConfigV2SettingsItems.MediaBrowserCompatMediaItem(), courseConfigV2NavDrawerItemFreeExtension, z, false, false, getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION, null, getintrodurationseconds);
        getschemaid.IconCompatParcelizer((getMeta) getSchemaId.AudioAttributesCompatParcelizer(getschemaid, courseConfigV2SettingsItems.onPrepareFromMediaId(), getquote2));
        return getschemaid;
    }

    public static SchemaKt write(CourseConfigV2SettingsItems courseConfigV2SettingsItems, getQuote getquote) {
        if (courseConfigV2SettingsItems == null) {
            RemoteActionCompatParcelizer(13);
        }
        if (getquote == null) {
            RemoteActionCompatParcelizer(14);
        }
        return read(courseConfigV2SettingsItems, getquote);
    }

    private static SchemaKt read(CourseConfigV2SettingsItems courseConfigV2SettingsItems, getQuote getquote) {
        if (courseConfigV2SettingsItems == null) {
            RemoteActionCompatParcelizer(15);
        }
        if (getquote == null) {
            RemoteActionCompatParcelizer(16);
        }
        return read(courseConfigV2SettingsItems, getquote, true, false, false, courseConfigV2SettingsItems.RatingCompat());
    }

    public static SchemaKt read(CourseConfigV2SettingsItems courseConfigV2SettingsItems, getQuote getquote, boolean z, boolean z2, boolean z3, getIntroDurationSeconds getintrodurationseconds) {
        if (courseConfigV2SettingsItems == null) {
            RemoteActionCompatParcelizer(17);
        }
        if (getquote == null) {
            RemoteActionCompatParcelizer(18);
        }
        if (getintrodurationseconds == null) {
            RemoteActionCompatParcelizer(19);
        }
        return new SchemaKt(courseConfigV2SettingsItems, getquote, courseConfigV2SettingsItems.MediaBrowserCompatMediaItem(), courseConfigV2SettingsItems.onCustomAction(), z, false, false, getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION, null, getintrodurationseconds);
    }

    public static NetworkStat RemoteActionCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, getIntroDurationSeconds getintrodurationseconds) {
        if (getintrodurationseconds == null) {
            RemoteActionCompatParcelizer(21);
        }
        return new RemoteActionCompatParcelizer(courseConfigV2CustomModuleQuestionSource, getintrodurationseconds);
    }

    public static CourseConfigV2SupportItem RemoteActionCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            RemoteActionCompatParcelizer(22);
        }
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        getAttemptedCount getattemptedcountRemoteActionCompatParcelizer = getAttemptedCount.read(courseConfigV2CustomModuleQuestionSource, getQuote.AudioAttributesCompatParcelizer.read(), getZenArea.MediaBrowserCompatItemReceiver, getTestHeaderTitle.RemoteActionCompatParcelizer.SYNTHESIZED, courseConfigV2CustomModuleQuestionSource.RatingCompat()).read(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), setLocked.AudioAttributesCompatParcelizer((getVariant) courseConfigV2CustomModuleQuestionSource).write(getTotalSubject.INVARIANT, courseConfigV2CustomModuleQuestionSource.aP_()), CourseConfigV2NavDrawerItems.FINAL, CourseConfigV2NavDrawerItemFaq.MediaBrowserCompatMediaItem);
        if (getattemptedcountRemoteActionCompatParcelizer == null) {
            RemoteActionCompatParcelizer(23);
        }
        return getattemptedcountRemoteActionCompatParcelizer;
    }

    public static CourseConfigV2SupportItem read(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            RemoteActionCompatParcelizer(24);
        }
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        getAttemptedCount getattemptedcount = getAttemptedCount.read(courseConfigV2CustomModuleQuestionSource, getQuote.AudioAttributesCompatParcelizer.read(), getZenArea.MediaDescriptionCompat, getTestHeaderTitle.RemoteActionCompatParcelizer.SYNTHESIZED, courseConfigV2CustomModuleQuestionSource.RatingCompat());
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = getQuote.IconCompatParcelizer;
        getAttemptedCount getattemptedcountRemoteActionCompatParcelizer = getattemptedcount.read(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new getLastHtmlBody(getattemptedcount, null, 0, getQuote.AudioAttributesCompatParcelizer.read(), getRelatedLessonId.RemoteActionCompatParcelizer(AppMeasurementSdk.ConditionalUserProperty.VALUE), setLocked.AudioAttributesCompatParcelizer((getVariant) courseConfigV2CustomModuleQuestionSource).onPrepareFromSearch(), false, false, false, null, courseConfigV2CustomModuleQuestionSource.RatingCompat())), courseConfigV2CustomModuleQuestionSource.aP_(), CourseConfigV2NavDrawerItems.FINAL, CourseConfigV2NavDrawerItemFaq.MediaBrowserCompatMediaItem);
        if (getattemptedcountRemoteActionCompatParcelizer == null) {
            RemoteActionCompatParcelizer(25);
        }
        return getattemptedcountRemoteActionCompatParcelizer;
    }

    public static CourseConfigV2SettingsItems IconCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            RemoteActionCompatParcelizer(26);
        }
        getTopSection gettopsectionAudioAttributesCompatParcelizer = getAnswerDescription.AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSource);
        isAspectRatioValid isaspectratiovalid = isAspectRatioValid.IconCompatParcelizer;
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = CourseConfigV2NavDrawerItemReportPiracy.AudioAttributesCompatParcelizer(gettopsectionAudioAttributesCompatParcelizer, isAspectRatioValid.AudioAttributesImplApi21Parcelizer());
        if (courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer == null) {
            return null;
        }
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        getRootSubjectId getrootsubjectidIconCompatParcelizer = getRootSubjectId.IconCompatParcelizer(courseConfigV2CustomModuleQuestionSource, getQuote.AudioAttributesCompatParcelizer.read(), CourseConfigV2NavDrawerItems.FINAL, CourseConfigV2NavDrawerItemFaq.MediaBrowserCompatMediaItem, false, getZenArea.AudioAttributesImplApi21Parcelizer, getTestHeaderTitle.RemoteActionCompatParcelizer.SYNTHESIZED, courseConfigV2CustomModuleQuestionSource.RatingCompat());
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = getQuote.IconCompatParcelizer;
        SchemaKt schemaKt = new SchemaKt(getrootsubjectidIconCompatParcelizer, getQuote.AudioAttributesCompatParcelizer.read(), CourseConfigV2NavDrawerItems.FINAL, CourseConfigV2NavDrawerItemFaq.MediaBrowserCompatMediaItem, false, false, false, getTestHeaderTitle.RemoteActionCompatParcelizer.SYNTHESIZED, null, courseConfigV2CustomModuleQuestionSource.RatingCompat());
        getrootsubjectidIconCompatParcelizer.read(schemaKt, (getAppSettings) null);
        getGroupDescription.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3 = getGroupDescription.AudioAttributesCompatParcelizer;
        getrootsubjectidIconCompatParcelizer.write(AddOnMetaKt.IconCompatParcelizer(getGroupDescription.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver(), (List<? extends setDefault>) Collections.singletonList(new isIndividualPlan(courseConfigV2CustomModuleQuestionSource.aP_()))), Collections.emptyList(), null, null, Collections.emptyList());
        schemaKt.write(getrootsubjectidIconCompatParcelizer.AudioAttributesImplBaseParcelizer());
        return getrootsubjectidIconCompatParcelizer;
    }

    public static boolean write(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        if (courseConfigV2NavDrawerItemRateUs == null) {
            RemoteActionCompatParcelizer(27);
        }
        return courseConfigV2NavDrawerItemRateUs.aQ_().equals(getZenArea.MediaBrowserCompatItemReceiver) && RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemRateUs);
    }

    public static boolean IconCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        if (courseConfigV2NavDrawerItemRateUs == null) {
            RemoteActionCompatParcelizer(28);
        }
        return courseConfigV2NavDrawerItemRateUs.aQ_().equals(getZenArea.MediaDescriptionCompat) && RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemRateUs);
    }

    private static boolean RemoteActionCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        if (courseConfigV2NavDrawerItemRateUs == null) {
            RemoteActionCompatParcelizer(29);
        }
        return courseConfigV2NavDrawerItemRateUs.handleMediaPlayPauseIfPendingOnHandler() == getTestHeaderTitle.RemoteActionCompatParcelizer.SYNTHESIZED && getAnswerDescription.MediaBrowserCompatItemReceiver(courseConfigV2NavDrawerItemRateUs.onPlayFromMediaId());
    }

    public static CourseConfigV2TestTabItem AudioAttributesCompatParcelizer(getVideoPageNotesTitle getvideopagenotestitle, getLink getlink, getQuote getquote) {
        if (getvideopagenotestitle == null) {
            RemoteActionCompatParcelizer(30);
        }
        if (getquote == null) {
            RemoteActionCompatParcelizer(31);
        }
        if (getlink == null) {
            return null;
        }
        return new getCorrectnessScore(getvideopagenotestitle, new getMainMcqIds(getvideopagenotestitle, getlink, null), getquote);
    }

    public static CourseConfigV2TestTabItem read(getVideoPageNotesTitle getvideopagenotestitle, getLink getlink, getRelatedLessonId getrelatedlessonid, getQuote getquote, int i) {
        if (getvideopagenotestitle == null) {
            RemoteActionCompatParcelizer(32);
        }
        if (getquote == null) {
            RemoteActionCompatParcelizer(33);
        }
        if (getlink == null) {
            return null;
        }
        return new getCorrectnessScore(getvideopagenotestitle, new getAnsweredCount(getvideopagenotestitle, getlink, getrelatedlessonid, null), getquote, getReadTime.AudioAttributesCompatParcelizer(i));
    }

    public static CourseConfigV2TestTabItem read(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, getLink getlink, getRelatedLessonId getrelatedlessonid, getQuote getquote, int i) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            RemoteActionCompatParcelizer(34);
        }
        if (getquote == null) {
            RemoteActionCompatParcelizer(35);
        }
        if (getlink == null) {
            return null;
        }
        return new getCorrectnessScore(courseConfigV2CustomModuleQuestionSource, new McqPager(courseConfigV2CustomModuleQuestionSource, getlink, getrelatedlessonid), getquote, getReadTime.AudioAttributesCompatParcelizer(i));
    }

    private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
