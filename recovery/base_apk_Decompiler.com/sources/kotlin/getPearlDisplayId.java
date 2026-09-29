package kotlin;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getPearlDisplayId extends isHtmlPearl {
    @Override // kotlin.setPearlType, kotlin.getPlanAddOns
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public abstract CourseConfigV2CustomModuleQuestionSource RemoteActionCompatParcelizer();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getPearlDisplayId(getMini getmini) {
        super(getmini);
        if (getmini == null) {
            IconCompatParcelizer(0);
        }
    }

    @Override // kotlin.getPlanAddOns
    public final getTestTabItems aU_() {
        getTestTabItems gettesttabitemsAudioAttributesCompatParcelizer = setLocked.AudioAttributesCompatParcelizer((getVariant) RemoteActionCompatParcelizer());
        if (gettesttabitemsAudioAttributesCompatParcelizer == null) {
            IconCompatParcelizer(1);
        }
        return gettesttabitemsAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setPearlType
    protected final boolean AudioAttributesCompatParcelizer(getQuestionLimit getquestionlimit) {
        if (getquestionlimit == null) {
            IconCompatParcelizer(2);
        }
        return (getquestionlimit instanceof CourseConfigV2CustomModuleQuestionSource) && write(RemoteActionCompatParcelizer(), getquestionlimit);
    }

    @Override // kotlin.isHtmlPearl
    protected final Collection<getLink> read(boolean z) {
        getVariant getvariantAudioAttributesImplApi21Parcelizer = RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer();
        if (!(getvariantAudioAttributesImplApi21Parcelizer instanceof CourseConfigV2CustomModuleQuestionSource)) {
            List listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                IconCompatParcelizer(3);
            }
            return listEmptyList;
        }
        getMonthTimeStamp getmonthtimestamp = new getMonthTimeStamp();
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = (CourseConfigV2CustomModuleQuestionSource) getvariantAudioAttributesImplApi21Parcelizer;
        getmonthtimestamp.add(courseConfigV2CustomModuleQuestionSource.aP_());
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = courseConfigV2CustomModuleQuestionSource.AudioAttributesCompatParcelizer();
        if (z && courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer != null) {
            getmonthtimestamp.add(courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer.aP_());
        }
        return getmonthtimestamp;
    }

    @Override // kotlin.isHtmlPearl
    protected final getLink aT_() {
        if (getTestTabItems.write(RemoteActionCompatParcelizer())) {
            return null;
        }
        return aU_().write();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void IconCompatParcelizer(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getPearlDisplayId.IconCompatParcelizer(int):void");
    }
}
