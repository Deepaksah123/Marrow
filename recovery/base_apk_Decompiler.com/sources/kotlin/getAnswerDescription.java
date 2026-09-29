package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.getTestHeaderTitle;

/* JADX INFO: loaded from: classes4.dex */
public final class getAnswerDescription {
    static {
        new getNotesCount("kotlin.jvm.JvmName");
    }

    public static CourseConfigV2TestTabItem write(getVariant getvariant) {
        if (getvariant == null) {
            write(0);
        }
        if (getvariant instanceof CourseConfigV2CustomModuleQuestionSource) {
            return ((CourseConfigV2CustomModuleQuestionSource) getvariant).onPlayFromSearch();
        }
        return null;
    }

    public static boolean MediaDescriptionCompat(getVariant getvariant) {
        if (getvariant == null) {
            write(1);
        }
        while (getvariant != null) {
            if (onCustomAction(getvariant) || onCommand(getvariant)) {
                return true;
            }
            getvariant = getvariant.AudioAttributesImplApi21Parcelizer();
        }
        return false;
    }

    private static boolean onCommand(getVariant getvariant) {
        return (getvariant instanceof getSubText) && ((getSubText) getvariant).onCustomAction() == CourseConfigV2NavDrawerItemFaq.AudioAttributesImplApi21Parcelizer;
    }

    public static getSlidesCount RemoteActionCompatParcelizer(getVariant getvariant) {
        if (getvariant == null) {
            write(2);
        }
        getNotesCount getnotescountHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler(getvariant);
        return getnotescountHandleMediaPlayPauseIfPendingOnHandler != null ? getnotescountHandleMediaPlayPauseIfPendingOnHandler.AudioAttributesImplApi26Parcelizer() : onAddQueueItem(getvariant);
    }

    public static getNotesCount read(getVariant getvariant) {
        if (getvariant == null) {
            write(3);
        }
        getNotesCount getnotescountHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler(getvariant);
        if (getnotescountHandleMediaPlayPauseIfPendingOnHandler == null) {
            getnotescountHandleMediaPlayPauseIfPendingOnHandler = onAddQueueItem(getvariant).MediaBrowserCompatItemReceiver();
        }
        if (getnotescountHandleMediaPlayPauseIfPendingOnHandler == null) {
            write(4);
        }
        return getnotescountHandleMediaPlayPauseIfPendingOnHandler;
    }

    private static getNotesCount handleMediaPlayPauseIfPendingOnHandler(getVariant getvariant) {
        if (getvariant == null) {
            write(5);
        }
        if ((getvariant instanceof getTopSection) || SubscriptionType.write(getvariant)) {
            return getNotesCount.read;
        }
        if (getvariant instanceof CourseConfigV2SearchItem) {
            return ((CourseConfigV2SearchItem) getvariant).read();
        }
        if (getvariant instanceof getShouldShowEmptyPlanScreen) {
            return ((getShouldShowEmptyPlanScreen) getvariant).IconCompatParcelizer();
        }
        return null;
    }

    private static getSlidesCount onAddQueueItem(getVariant getvariant) {
        if (getvariant == null) {
            write(6);
        }
        return RemoteActionCompatParcelizer(getvariant.AudioAttributesImplApi21Parcelizer()).read(getvariant.aQ_());
    }

    public static boolean RatingCompat(getVariant getvariant) {
        return getvariant != null && (getvariant.AudioAttributesImplApi21Parcelizer() instanceof getShouldShowEmptyPlanScreen);
    }

    public static boolean RemoteActionCompatParcelizer(getVariant getvariant, getVariant getvariant2) {
        if (getvariant == null) {
            write(16);
        }
        if (getvariant2 == null) {
            write(17);
        }
        return AudioAttributesCompatParcelizer(getvariant).equals(AudioAttributesCompatParcelizer(getvariant2));
    }

    public static <D extends getVariant> D AudioAttributesCompatParcelizer(getVariant getvariant, Class<D> cls) {
        return (D) write(getvariant, cls, true);
    }

    public static <D extends getVariant> D write(getVariant getvariant, Class<D> cls, boolean z) {
        if (cls == null) {
            write(19);
        }
        if (getvariant == null) {
            return null;
        }
        if (z) {
            getvariant = (D) getvariant.AudioAttributesImplApi21Parcelizer();
        }
        while (getvariant != null) {
            if (cls.isInstance(getvariant)) {
                return (D) getvariant;
            }
            getvariant = (D) getvariant.AudioAttributesImplApi21Parcelizer();
        }
        return null;
    }

    public static getTopSection read(getLink getlink) {
        if (getlink == null) {
            write(20);
        }
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        if (getquestionlimitRemoteActionCompatParcelizer == null) {
            return null;
        }
        return MediaBrowserCompatSearchResultReceiver(getquestionlimitRemoteActionCompatParcelizer);
    }

    public static getTopSection AudioAttributesCompatParcelizer(getVariant getvariant) {
        if (getvariant == null) {
            write(21);
        }
        getTopSection gettopsectionMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver(getvariant);
        if (gettopsectionMediaBrowserCompatSearchResultReceiver == null) {
            write(22);
        }
        return gettopsectionMediaBrowserCompatSearchResultReceiver;
    }

    private static getTopSection MediaBrowserCompatSearchResultReceiver(getVariant getvariant) {
        if (getvariant == null) {
            write(23);
        }
        while (getvariant != null) {
            if (getvariant instanceof getTopSection) {
                return (getTopSection) getvariant;
            }
            if (getvariant instanceof CourseConfigV2SearchItem) {
                return ((CourseConfigV2SearchItem) getvariant).MediaBrowserCompatItemReceiver();
            }
            getvariant = getvariant.AudioAttributesImplApi21Parcelizer();
        }
        return null;
    }

    public static boolean IconCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource2) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            write(26);
        }
        if (courseConfigV2CustomModuleQuestionSource2 == null) {
            write(27);
        }
        Iterator<getLink> it = courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatSearchResultReceiver().aV_().iterator();
        while (it.hasNext()) {
            if (write(it.next(), courseConfigV2CustomModuleQuestionSource2.onAddQueueItem())) {
                return true;
            }
        }
        return false;
    }

    public static boolean read(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource2) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            write(28);
        }
        if (courseConfigV2CustomModuleQuestionSource2 == null) {
            write(29);
        }
        return IconCompatParcelizer(courseConfigV2CustomModuleQuestionSource.aP_(), courseConfigV2CustomModuleQuestionSource2.onAddQueueItem());
    }

    private static boolean write(getLink getlink, getVariant getvariant) {
        if (getlink == null) {
            write(30);
        }
        if (getvariant == null) {
            write(31);
        }
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        if (getquestionlimitRemoteActionCompatParcelizer == null) {
            return false;
        }
        getVariant getvariantOnAddQueueItem = getquestionlimitRemoteActionCompatParcelizer.aS_();
        return (getvariantOnAddQueueItem instanceof getQuestionLimit) && (getvariant instanceof getQuestionLimit) && ((getQuestionLimit) getvariant).MediaBrowserCompatSearchResultReceiver().equals(((getQuestionLimit) getvariantOnAddQueueItem).MediaBrowserCompatSearchResultReceiver());
    }

    public static boolean IconCompatParcelizer(getLink getlink, getVariant getvariant) {
        if (getlink == null) {
            write(32);
        }
        if (getvariant == null) {
            write(33);
        }
        if (write(getlink, getvariant)) {
            return true;
        }
        Iterator<getLink> it = getlink.AudioAttributesImplApi21Parcelizer().aV_().iterator();
        while (it.hasNext()) {
            if (IconCompatParcelizer(it.next(), getvariant)) {
                return true;
            }
        }
        return false;
    }

    public static boolean AudioAttributesImplApi21Parcelizer(getVariant getvariant) {
        return AudioAttributesCompatParcelizer(getvariant, getQuestionSource.OBJECT) && ((CourseConfigV2CustomModuleQuestionSource) getvariant).onAddQueueItem();
    }

    public static boolean MediaBrowserCompatMediaItem(getVariant getvariant) {
        return (AudioAttributesCompatParcelizer(getvariant, getQuestionSource.CLASS) || AudioAttributesCompatParcelizer(getvariant, getQuestionSource.INTERFACE)) && ((CourseConfigV2CustomModuleQuestionSource) getvariant).MediaBrowserCompatMediaItem() == CourseConfigV2NavDrawerItems.SEALED;
    }

    private static boolean onCustomAction(getVariant getvariant) {
        if (getvariant == null) {
            write(34);
        }
        return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(getvariant) && getvariant.aQ_().equals(getVideoMetaEncrypt.AudioAttributesImplApi21Parcelizer);
    }

    public static boolean AudioAttributesImplApi26Parcelizer(getVariant getvariant) {
        if (getvariant == null) {
            write(36);
        }
        return AudioAttributesCompatParcelizer(getvariant, getQuestionSource.ENUM_ENTRY);
    }

    public static boolean MediaBrowserCompatItemReceiver(getVariant getvariant) {
        return AudioAttributesCompatParcelizer(getvariant, getQuestionSource.ENUM_CLASS);
    }

    public static boolean AudioAttributesImplBaseParcelizer(getVariant getvariant) {
        return AudioAttributesCompatParcelizer(getvariant, getQuestionSource.ANNOTATION_CLASS);
    }

    public static boolean MediaMetadataCompat(getVariant getvariant) {
        return AudioAttributesCompatParcelizer(getvariant, getQuestionSource.INTERFACE);
    }

    private static boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(getVariant getvariant) {
        return AudioAttributesCompatParcelizer(getvariant, getQuestionSource.CLASS);
    }

    public static boolean MediaBrowserCompatCustomActionResultReceiver(getVariant getvariant) {
        return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(getvariant) || MediaBrowserCompatItemReceiver(getvariant);
    }

    private static boolean AudioAttributesCompatParcelizer(getVariant getvariant, getQuestionSource getquestionsource) {
        if (getquestionsource == null) {
            write(37);
        }
        return (getvariant instanceof CourseConfigV2CustomModuleQuestionSource) && ((CourseConfigV2CustomModuleQuestionSource) getvariant).AudioAttributesImplBaseParcelizer() == getquestionsource;
    }

    public static CourseConfigV2CustomModuleQuestionSource RemoteActionCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            write(44);
        }
        Iterator<getLink> it = courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatSearchResultReceiver().aV_().iterator();
        while (it.hasNext()) {
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceIconCompatParcelizer = IconCompatParcelizer(it.next());
            if (courseConfigV2CustomModuleQuestionSourceIconCompatParcelizer.AudioAttributesImplBaseParcelizer() != getQuestionSource.INTERFACE) {
                return courseConfigV2CustomModuleQuestionSourceIconCompatParcelizer;
            }
        }
        return null;
    }

    public static CourseConfigV2CustomModuleQuestionSource IconCompatParcelizer(getLink getlink) {
        if (getlink == null) {
            write(45);
        }
        return IconCompatParcelizer(getlink.AudioAttributesImplApi21Parcelizer());
    }

    private static CourseConfigV2CustomModuleQuestionSource IconCompatParcelizer(getPlanAddOns getplanaddons) {
        if (getplanaddons == null) {
            write(46);
        }
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = (CourseConfigV2CustomModuleQuestionSource) getplanaddons.RemoteActionCompatParcelizer();
        if (courseConfigV2CustomModuleQuestionSource == null) {
            write(47);
        }
        return courseConfigV2CustomModuleQuestionSource;
    }

    public static CourseConfigV2NavDrawerItemFreeExtension IconCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, boolean z) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            write(48);
        }
        getQuestionSource getquestionsourceAudioAttributesImplBaseParcelizer = courseConfigV2CustomModuleQuestionSource.AudioAttributesImplBaseParcelizer();
        if (getquestionsourceAudioAttributesImplBaseParcelizer == getQuestionSource.ENUM_CLASS || getquestionsourceAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer()) {
            CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension = CourseConfigV2NavDrawerItemFaq.AudioAttributesImplBaseParcelizer;
            if (courseConfigV2NavDrawerItemFreeExtension == null) {
                write(49);
            }
            return courseConfigV2NavDrawerItemFreeExtension;
        }
        if (MediaBrowserCompatMediaItem(courseConfigV2CustomModuleQuestionSource)) {
            CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension2 = CourseConfigV2NavDrawerItemFaq.AudioAttributesImplBaseParcelizer;
            if (courseConfigV2NavDrawerItemFreeExtension2 == null) {
                write(51);
            }
            return courseConfigV2NavDrawerItemFreeExtension2;
        }
        if (onCustomAction(courseConfigV2CustomModuleQuestionSource)) {
            CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension3 = CourseConfigV2NavDrawerItemFaq.write;
            if (courseConfigV2NavDrawerItemFreeExtension3 == null) {
                write(52);
            }
            return courseConfigV2NavDrawerItemFreeExtension3;
        }
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension4 = CourseConfigV2NavDrawerItemFaq.MediaBrowserCompatMediaItem;
        if (courseConfigV2NavDrawerItemFreeExtension4 == null) {
            write(53);
        }
        return courseConfigV2NavDrawerItemFreeExtension4;
    }

    public static <D extends getTestHeaderTitle> D read(D d) {
        if (d == null) {
            write(59);
        }
        while (d.handleMediaPlayPauseIfPendingOnHandler() == getTestHeaderTitle.RemoteActionCompatParcelizer.FAKE_OVERRIDE) {
            Collection<? extends getTestHeaderTitle> collectionAudioAttributesImplApi26Parcelizer = d.AudioAttributesImplApi26Parcelizer();
            if (collectionAudioAttributesImplApi26Parcelizer.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: ".concat(String.valueOf(d)));
            }
            d = (D) collectionAudioAttributesImplApi26Parcelizer.iterator().next();
        }
        if (d == null) {
            write(60);
        }
        return d;
    }

    public static <D extends getSubText> D IconCompatParcelizer(D d) {
        if (d == null) {
            write(64);
        }
        if (d instanceof getTestHeaderTitle) {
            return read((getTestHeaderTitle) d);
        }
        if (d == null) {
            write(65);
        }
        return d;
    }

    public static boolean write(Editor editor, getLink getlink) {
        if (editor == null) {
            write(66);
        }
        if (getlink == null) {
            write(67);
        }
        if (editor.onRewind() || Copy.write(getlink)) {
            return false;
        }
        if (setPlanAddOns.RemoteActionCompatParcelizer(getlink)) {
            return true;
        }
        getTestTabItems gettesttabitemsAudioAttributesCompatParcelizer = setLocked.AudioAttributesCompatParcelizer(editor);
        if (!getTestTabItems.AudioAttributesImplBaseParcelizer(getlink) && !PlanData.AudioAttributesCompatParcelizer.IconCompatParcelizer(gettesttabitemsAudioAttributesCompatParcelizer.onPrepareFromSearch(), getlink) && !PlanData.AudioAttributesCompatParcelizer.IconCompatParcelizer(gettesttabitemsAudioAttributesCompatParcelizer.onMediaButtonEvent().aP_(), getlink) && !PlanData.AudioAttributesCompatParcelizer.IconCompatParcelizer(gettesttabitemsAudioAttributesCompatParcelizer.write(), getlink)) {
            getVideoSubjectPageItems getvideosubjectpageitems = getVideoSubjectPageItems.IconCompatParcelizer;
            if (!getVideoSubjectPageItems.AudioAttributesCompatParcelizer(getlink)) {
                return false;
            }
        }
        return true;
    }

    public static <D extends getVideoPageNotesTitle> Set<D> AudioAttributesCompatParcelizer(D d) {
        if (d == null) {
            write(71);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        IconCompatParcelizer(d.onAddQueueItem(), linkedHashSet);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <D extends getVideoPageNotesTitle> void IconCompatParcelizer(D d, Set<D> set) {
        if (d == null) {
            write(73);
        }
        if (set == 0) {
            write(74);
        }
        if (set.contains(d)) {
            return;
        }
        Iterator<? extends getVideoPageNotesTitle> it = d.onAddQueueItem().AudioAttributesImplApi26Parcelizer().iterator();
        while (it.hasNext()) {
            getVideoPageNotesTitle getvideopagenotestitleAS_ = it.next().onAddQueueItem();
            IconCompatParcelizer(getvideopagenotestitleAS_, set);
            set.add(getvideopagenotestitleAS_);
        }
    }

    public static CourseConfigV2VideoPageItem IconCompatParcelizer(getVariant getvariant) {
        if (getvariant == null) {
            write(82);
        }
        if (getvariant instanceof getAppSettings) {
            getvariant = ((getAppSettings) getvariant).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (getvariant instanceof CourseConfigV2HomePageItems) {
            CourseConfigV2VideoPageItem courseConfigV2VideoPageItemAudioAttributesCompatParcelizer = ((CourseConfigV2HomePageItems) getvariant).RatingCompat().AudioAttributesCompatParcelizer();
            if (courseConfigV2VideoPageItemAudioAttributesCompatParcelizer == null) {
                write(83);
            }
            return courseConfigV2VideoPageItemAudioAttributesCompatParcelizer;
        }
        CourseConfigV2VideoPageItem courseConfigV2VideoPageItem = CourseConfigV2VideoPageItem.read;
        if (courseConfigV2VideoPageItem == null) {
            write(84);
        }
        return courseConfigV2VideoPageItem;
    }

    private static /* synthetic */ void write(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }
}
