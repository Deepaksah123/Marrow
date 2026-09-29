package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.getZenArea;

/* JADX INFO: loaded from: classes4.dex */
public final class setDesriptionList {
    public static final setDesriptionList read = RemoteActionCompatParcelizer(isVideoPlanCtype.write);
    private final isVideoPlanCtype write;

    enum IconCompatParcelizer {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    static final class read extends Exception {
        public read(String str) {
            super(str);
        }
    }

    public static setDesriptionList RemoteActionCompatParcelizer(isVideoPlanCtype isvideoplanctype) {
        if (isvideoplanctype == null) {
            read(0);
        }
        return new setDesriptionList(isvideoplanctype);
    }

    private setDesriptionList write() {
        isVideoPlanCtype isvideoplanctype = this.write;
        return ((isvideoplanctype instanceof setKeySubjectIds) && isvideoplanctype.write()) ? new setDesriptionList(new setKeySubjectIds(((setKeySubjectIds) this.write).IconCompatParcelizer(), ((setKeySubjectIds) this.write).RemoteActionCompatParcelizer(), false)) : this;
    }

    public static setDesriptionList RemoteActionCompatParcelizer(isVideoPlanCtype isvideoplanctype, isVideoPlanCtype isvideoplanctype2) {
        if (isvideoplanctype == null) {
            read(3);
        }
        if (isvideoplanctype2 == null) {
            read(4);
        }
        return RemoteActionCompatParcelizer(setThumbnailV2Url.IconCompatParcelizer(isvideoplanctype, isvideoplanctype2));
    }

    public static setDesriptionList AudioAttributesCompatParcelizer(getLink getlink) {
        if (getlink == null) {
            read(6);
        }
        return RemoteActionCompatParcelizer(getSubscriptionDetails.RemoteActionCompatParcelizer(getlink.AudioAttributesImplApi21Parcelizer(), getlink.bb_()));
    }

    private setDesriptionList(isVideoPlanCtype isvideoplanctype) {
        if (isvideoplanctype == null) {
            read(7);
        }
        this.write = isvideoplanctype;
    }

    public final boolean read() {
        return this.write.read();
    }

    public final isVideoPlanCtype AudioAttributesCompatParcelizer() {
        isVideoPlanCtype isvideoplanctype = this.write;
        if (isvideoplanctype == null) {
            read(8);
        }
        return isvideoplanctype;
    }

    public final getLink AudioAttributesCompatParcelizer(getLink getlink, getTotalSubject gettotalsubject) {
        if (getlink == null) {
            read(9);
        }
        if (gettotalsubject == null) {
            read(10);
        }
        if (read()) {
            if (getlink == null) {
                read(11);
            }
            return getlink;
        }
        try {
            getLink getlinkAudioAttributesCompatParcelizer = IconCompatParcelizer(new isIndividualPlan(gettotalsubject, getlink), null, 0).AudioAttributesCompatParcelizer();
            if (getlinkAudioAttributesCompatParcelizer == null) {
                read(12);
            }
            return getlinkAudioAttributesCompatParcelizer;
        } catch (read e) {
            PlanSubscriptionItemKt planSubscriptionItemKt = SubscriptionType.read(setAccessLevel.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
            if (planSubscriptionItemKt == null) {
                read(13);
            }
            return planSubscriptionItemKt;
        }
    }

    public final getLink IconCompatParcelizer(getLink getlink, getTotalSubject gettotalsubject) {
        if (getlink == null) {
            read(14);
        }
        if (gettotalsubject == null) {
            read(15);
        }
        setDefault setdefaultAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(new isIndividualPlan(gettotalsubject, AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(getlink, gettotalsubject)));
        if (setdefaultAudioAttributesCompatParcelizer == null) {
            return null;
        }
        return setdefaultAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    private setDefault AudioAttributesCompatParcelizer(setDefault setdefault) {
        setDefault setdefaultIconCompatParcelizer = IconCompatParcelizer(setdefault);
        return (this.write.AudioAttributesCompatParcelizer() || this.write.write()) ? getBulletDescText.RemoteActionCompatParcelizer(setdefaultIconCompatParcelizer, this.write.write()) : setdefaultIconCompatParcelizer;
    }

    public final setDefault IconCompatParcelizer(setDefault setdefault) {
        if (setdefault == null) {
            read(17);
        }
        if (read()) {
            return setdefault;
        }
        try {
            return IconCompatParcelizer(setdefault, null, 0);
        } catch (read unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private setDefault IconCompatParcelizer(setDefault setdefault, getBadgeText getbadgetext, int i) throws read {
        getLink getlinkWrite;
        if (setdefault == null) {
            read(18);
        }
        write(i, setdefault, this.write);
        if (!setdefault.write()) {
            getLink getlinkAudioAttributesCompatParcelizer = setdefault.AudioAttributesCompatParcelizer();
            if (getlinkAudioAttributesCompatParcelizer instanceof getNoteEdition) {
                getNoteEdition getnoteedition = (getNoteEdition) getlinkAudioAttributesCompatParcelizer;
                PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatItemReceiver = getnoteedition.MediaBrowserCompatItemReceiver();
                getLink getlinkMediaBrowserCompatCustomActionResultReceiver = getnoteedition.MediaBrowserCompatCustomActionResultReceiver();
                setDefault setdefaultIconCompatParcelizer = IconCompatParcelizer(new isIndividualPlan(setdefault.read(), planAddOnsCompanionMediaBrowserCompatItemReceiver), getbadgetext, i + 1);
                if (!setdefaultIconCompatParcelizer.write()) {
                    return new isIndividualPlan(setdefaultIconCompatParcelizer.read(), setPlanType.RemoteActionCompatParcelizer(setdefaultIconCompatParcelizer.AudioAttributesCompatParcelizer().MediaBrowserCompatMediaItem(), IconCompatParcelizer(getlinkMediaBrowserCompatCustomActionResultReceiver, setdefault.read())));
                }
                if (setdefaultIconCompatParcelizer == null) {
                    read(20);
                }
                return setdefaultIconCompatParcelizer;
            }
            if (!getKeySubjectIds.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer) && !(getlinkAudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem() instanceof Link)) {
                setDefault setdefaultIconCompatParcelizer2 = this.write.IconCompatParcelizer(getlinkAudioAttributesCompatParcelizer);
                setDefault setdefaultRemoteActionCompatParcelizer = setdefaultIconCompatParcelizer2 != null ? RemoteActionCompatParcelizer(getlinkAudioAttributesCompatParcelizer, setdefaultIconCompatParcelizer2, getbadgetext, setdefault) : null;
                getTotalSubject gettotalsubjectAudioAttributesCompatParcelizer = setdefault.read();
                if (setdefaultRemoteActionCompatParcelizer == null && PearlSubjectInfo.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer) && !isDefault.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer)) {
                    getTopicId gettopicid = PearlSubjectInfo.read(getlinkAudioAttributesCompatParcelizer);
                    int i2 = i + 1;
                    setDefault setdefaultIconCompatParcelizer3 = IconCompatParcelizer(new isIndividualPlan(gettotalsubjectAudioAttributesCompatParcelizer, gettopicid.AudioAttributesImplBaseParcelizer()), getbadgetext, i2);
                    setDefault setdefaultIconCompatParcelizer4 = IconCompatParcelizer(new isIndividualPlan(gettotalsubjectAudioAttributesCompatParcelizer, gettopicid.AudioAttributesImplApi26Parcelizer()), getbadgetext, i2);
                    getTotalSubject gettotalsubject = setdefaultIconCompatParcelizer3.read();
                    if (setdefaultIconCompatParcelizer3.AudioAttributesCompatParcelizer() != gettopicid.AudioAttributesImplBaseParcelizer() || setdefaultIconCompatParcelizer4.AudioAttributesCompatParcelizer() != gettopicid.AudioAttributesImplApi26Parcelizer()) {
                        return new isIndividualPlan(gettotalsubject, AddOnMetaKt.AudioAttributesCompatParcelizer(setMinPrice.write(setdefaultIconCompatParcelizer3.AudioAttributesCompatParcelizer()), setMinPrice.write(setdefaultIconCompatParcelizer4.AudioAttributesCompatParcelizer())));
                    }
                    if (setdefault == null) {
                        read(22);
                        return setdefault;
                    }
                } else {
                    if (!getTestTabItems.AudioAttributesImplApi26Parcelizer(getlinkAudioAttributesCompatParcelizer) && !Copy.write(getlinkAudioAttributesCompatParcelizer)) {
                        if (setdefaultRemoteActionCompatParcelizer != null) {
                            IconCompatParcelizer IconCompatParcelizer2 = IconCompatParcelizer(gettotalsubjectAudioAttributesCompatParcelizer, setdefaultRemoteActionCompatParcelizer.read());
                            if (!getMcqUpdateStatusannotations.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer)) {
                                int i3 = AnonymousClass5.AudioAttributesCompatParcelizer[IconCompatParcelizer2.ordinal()];
                                if (i3 == 1) {
                                    throw new read("Out-projection in in-position");
                                }
                                if (i3 == 2) {
                                    return new isIndividualPlan(getTotalSubject.OUT_VARIANCE, getlinkAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer().aU_().onCommand());
                                }
                            }
                            setRootSubjectIds setrootsubjectidsRemoteActionCompatParcelizer = isDefault.RemoteActionCompatParcelizer(getlinkAudioAttributesCompatParcelizer);
                            if (setdefaultRemoteActionCompatParcelizer.write()) {
                                if (setdefaultRemoteActionCompatParcelizer == null) {
                                    read(24);
                                }
                                return setdefaultRemoteActionCompatParcelizer;
                            }
                            if (setrootsubjectidsRemoteActionCompatParcelizer != null) {
                                getlinkWrite = setrootsubjectidsRemoteActionCompatParcelizer.IconCompatParcelizer(setdefaultRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
                            } else {
                                getlinkWrite = setPlanAddOns.write(setdefaultRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), getlinkAudioAttributesCompatParcelizer.ba_());
                            }
                            if (!getlinkAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer()) {
                                getlinkWrite = getSearchTimes.write(getlinkWrite, new getPublishedStatus(getlinkWrite.RemoteActionCompatParcelizer(), read(this.write.read(getlinkAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()))));
                            }
                            if (IconCompatParcelizer2 == IconCompatParcelizer.NO_CONFLICT) {
                                gettotalsubjectAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(gettotalsubjectAudioAttributesCompatParcelizer, setdefaultRemoteActionCompatParcelizer.read());
                            }
                            return new isIndividualPlan(gettotalsubjectAudioAttributesCompatParcelizer, getlinkWrite);
                        }
                        setDefault setdefaultWrite = write(setdefault, i);
                        if (setdefaultWrite == null) {
                            read(25);
                        }
                        return setdefaultWrite;
                    }
                    if (setdefault == null) {
                        read(23);
                        return setdefault;
                    }
                }
            } else if (setdefault == null) {
                read(21);
            }
        } else if (setdefault == null) {
            read(19);
            return setdefault;
        }
        return setdefault;
    }

    /* JADX INFO: renamed from: o.setDesriptionList$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[IconCompatParcelizer.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[IconCompatParcelizer.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[IconCompatParcelizer.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AudioAttributesCompatParcelizer[IconCompatParcelizer.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static setDefault RemoteActionCompatParcelizer(getLink getlink, setDefault setdefault, getBadgeText getbadgetext, setDefault setdefault2) {
        if (getlink == null) {
            read(26);
        }
        if (setdefault == null) {
            read(27);
        }
        if (setdefault2 == null) {
            read(28);
        }
        if (getlink.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw)) {
            getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer = setdefault.AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer();
            if (getplanaddonsAudioAttributesImplApi21Parcelizer instanceof getFirstEligiblePlan) {
                setDefault setdefaultIconCompatParcelizer = ((getFirstEligiblePlan) getplanaddonsAudioAttributesImplApi21Parcelizer).IconCompatParcelizer();
                getTotalSubject gettotalsubject = setdefaultIconCompatParcelizer.read();
                if (IconCompatParcelizer(setdefault2.read(), gettotalsubject) == IconCompatParcelizer.OUT_IN_IN_POSITION) {
                    return new isIndividualPlan(setdefaultIconCompatParcelizer.AudioAttributesCompatParcelizer());
                }
                if (getbadgetext == null) {
                    if (setdefault == null) {
                        read(31);
                        return setdefault;
                    }
                } else {
                    if (IconCompatParcelizer(getbadgetext.MediaBrowserCompatMediaItem(), gettotalsubject) == IconCompatParcelizer.OUT_IN_IN_POSITION) {
                        return new isIndividualPlan(setdefaultIconCompatParcelizer.AudioAttributesCompatParcelizer());
                    }
                    if (setdefault == null) {
                        read(32);
                    }
                }
            } else if (setdefault == null) {
                read(30);
                return setdefault;
            }
        } else if (setdefault == null) {
            read(29);
            return setdefault;
        }
        return setdefault;
    }

    private static getQuote read(getQuote getquote) {
        if (getquote == null) {
            read(33);
        }
        if (getquote.AudioAttributesCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw)) {
            return new setPublishedStatus(getquote, new getAnswerMap<getNotesCount, Boolean>() { // from class: o.setDesriptionList.3
                @Override // kotlin.getAnswerMap
                public final /* synthetic */ Boolean invoke(getNotesCount getnotescount) {
                    return read(getnotescount);
                }

                private static Boolean read(getNotesCount getnotescount) {
                    if (getnotescount == null) {
                        RemoteActionCompatParcelizer();
                    }
                    return Boolean.valueOf(!getnotescount.equals(getZenArea.RemoteActionCompatParcelizer.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw));
                }

                private static /* synthetic */ void RemoteActionCompatParcelizer() {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
                }
            });
        }
        if (getquote == null) {
            read(34);
        }
        return getquote;
    }

    private setDefault write(setDefault setdefault, int i) throws read {
        getLink getlinkAudioAttributesCompatParcelizer = setdefault.AudioAttributesCompatParcelizer();
        getTotalSubject gettotalsubject = setdefault.read();
        if (getlinkAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer() instanceof getBadgeText) {
            return setdefault;
        }
        getHref gethrefWrite = Meta.write(getlinkAudioAttributesCompatParcelizer);
        getLink getlinkIconCompatParcelizer = gethrefWrite != null ? write().IconCompatParcelizer(gethrefWrite, getTotalSubject.INVARIANT) : null;
        getLink getlinkRemoteActionCompatParcelizer = setMinPrice.RemoteActionCompatParcelizer(getlinkAudioAttributesCompatParcelizer, read(getlinkAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(), getlinkAudioAttributesCompatParcelizer.bb_(), i), this.write.read(getlinkAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()));
        if ((getlinkRemoteActionCompatParcelizer instanceof getHref) && (getlinkIconCompatParcelizer instanceof getHref)) {
            getlinkRemoteActionCompatParcelizer = Meta.IconCompatParcelizer((getHref) getlinkRemoteActionCompatParcelizer, (getHref) getlinkIconCompatParcelizer);
        }
        return new isIndividualPlan(gettotalsubject, getlinkRemoteActionCompatParcelizer);
    }

    private List<setDefault> read(List<getBadgeText> list, List<setDefault> list2, int i) throws read {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            getBadgeText getbadgetext = list.get(i2);
            setDefault setdefault = list2.get(i2);
            setDefault setdefaultIconCompatParcelizer = IconCompatParcelizer(setdefault, getbadgetext, i + 1);
            int i3 = AnonymousClass5.AudioAttributesCompatParcelizer[IconCompatParcelizer(getbadgetext.MediaBrowserCompatMediaItem(), setdefaultIconCompatParcelizer.read()).ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 && getbadgetext.MediaBrowserCompatMediaItem() != getTotalSubject.INVARIANT && !setdefaultIconCompatParcelizer.write()) {
                    setdefaultIconCompatParcelizer = new isIndividualPlan(getTotalSubject.INVARIANT, setdefaultIconCompatParcelizer.AudioAttributesCompatParcelizer());
                }
            } else {
                setdefaultIconCompatParcelizer = setPlanAddOns.write(getbadgetext);
            }
            if (setdefaultIconCompatParcelizer != setdefault) {
                z = true;
            }
            arrayList.add(setdefaultIconCompatParcelizer);
        }
        return !z ? list2 : arrayList;
    }

    public static getTotalSubject AudioAttributesCompatParcelizer(getTotalSubject gettotalsubject, setDefault setdefault) {
        if (gettotalsubject == null) {
            read(35);
        }
        if (setdefault == null) {
            read(36);
        }
        if (!setdefault.write()) {
            return AudioAttributesCompatParcelizer(gettotalsubject, setdefault.read());
        }
        getTotalSubject gettotalsubject2 = getTotalSubject.OUT_VARIANCE;
        if (gettotalsubject2 == null) {
            read(37);
        }
        return gettotalsubject2;
    }

    private static getTotalSubject AudioAttributesCompatParcelizer(getTotalSubject gettotalsubject, getTotalSubject gettotalsubject2) {
        if (gettotalsubject == null) {
            read(38);
        }
        if (gettotalsubject2 == null) {
            read(39);
        }
        if (gettotalsubject == getTotalSubject.INVARIANT) {
            if (gettotalsubject2 == null) {
                read(40);
                return gettotalsubject2;
            }
        } else {
            if (gettotalsubject2 == getTotalSubject.INVARIANT) {
                if (gettotalsubject == null) {
                    read(41);
                }
                return gettotalsubject;
            }
            if (gettotalsubject != gettotalsubject2) {
                StringBuilder sb = new StringBuilder("Variance conflict: type parameter variance '");
                sb.append(gettotalsubject);
                sb.append("' and projection kind '");
                sb.append(gettotalsubject2);
                sb.append("' cannot be combined");
                throw new AssertionError(sb.toString());
            }
            if (gettotalsubject2 == null) {
                read(42);
            }
        }
        return gettotalsubject2;
    }

    private static IconCompatParcelizer IconCompatParcelizer(getTotalSubject gettotalsubject, getTotalSubject gettotalsubject2) {
        if (gettotalsubject == getTotalSubject.IN_VARIANCE && gettotalsubject2 == getTotalSubject.OUT_VARIANCE) {
            return IconCompatParcelizer.OUT_IN_IN_POSITION;
        }
        if (gettotalsubject == getTotalSubject.OUT_VARIANCE && gettotalsubject2 == getTotalSubject.IN_VARIANCE) {
            return IconCompatParcelizer.IN_IN_OUT_POSITION;
        }
        return IconCompatParcelizer.NO_CONFLICT;
    }

    private static void write(int i, setDefault setdefault, isVideoPlanCtype isvideoplanctype) {
        if (i <= 100) {
            return;
        }
        StringBuilder sb = new StringBuilder("Recursion too deep. Most likely infinite loop while substituting ");
        sb.append(read(setdefault));
        sb.append("; substitution: ");
        sb.append(read(isvideoplanctype));
        throw new IllegalStateException(sb.toString());
    }

    private static String read(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (setActiveEdition.write(th)) {
                throw th;
            }
            StringBuilder sb = new StringBuilder("[Exception while computing toString(): ");
            sb.append(th);
            sb.append("]");
            return sb.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void read(int r13) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setDesriptionList.read(int):void");
    }
}
