package kotlin;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.getTestHeaderTitle;

/* JADX INFO: loaded from: classes4.dex */
public final class getExpiredOn {
    public static <D extends getTestHeaderTitle> Collection<D> read(getRelatedLessonId getrelatedlessonid, Collection<D> collection, Collection<D> collection2, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, getFirstAttemptTime getfirstattempttime, getOptions getoptions) {
        if (getrelatedlessonid == null) {
            IconCompatParcelizer(0);
        }
        if (collection == null) {
            IconCompatParcelizer(1);
        }
        if (collection2 == null) {
            IconCompatParcelizer(2);
        }
        if (courseConfigV2CustomModuleQuestionSource == null) {
            IconCompatParcelizer(3);
        }
        if (getfirstattempttime == null) {
            IconCompatParcelizer(4);
        }
        if (getoptions == null) {
            IconCompatParcelizer(5);
        }
        return write(getrelatedlessonid, collection, collection2, courseConfigV2CustomModuleQuestionSource, getfirstattempttime, getoptions, false);
    }

    public static <D extends getTestHeaderTitle> Collection<D> IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, Collection<D> collection, Collection<D> collection2, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, getFirstAttemptTime getfirstattempttime, getOptions getoptions) {
        if (getrelatedlessonid == null) {
            IconCompatParcelizer(6);
        }
        if (collection == null) {
            IconCompatParcelizer(7);
        }
        if (collection2 == null) {
            IconCompatParcelizer(8);
        }
        if (courseConfigV2CustomModuleQuestionSource == null) {
            IconCompatParcelizer(9);
        }
        if (getfirstattempttime == null) {
            IconCompatParcelizer(10);
        }
        if (getoptions == null) {
            IconCompatParcelizer(11);
        }
        return write(getrelatedlessonid, collection, collection2, courseConfigV2CustomModuleQuestionSource, getfirstattempttime, getoptions, true);
    }

    private static <D extends getTestHeaderTitle> Collection<D> write(getRelatedLessonId getrelatedlessonid, Collection<D> collection, Collection<D> collection2, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, final getFirstAttemptTime getfirstattempttime, getOptions getoptions, final boolean z) {
        if (getrelatedlessonid == null) {
            IconCompatParcelizer(12);
        }
        if (collection == null) {
            IconCompatParcelizer(13);
        }
        if (collection2 == null) {
            IconCompatParcelizer(14);
        }
        if (courseConfigV2CustomModuleQuestionSource == null) {
            IconCompatParcelizer(15);
        }
        if (getfirstattempttime == null) {
            IconCompatParcelizer(16);
        }
        if (getoptions == null) {
            IconCompatParcelizer(17);
        }
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        getoptions.RemoteActionCompatParcelizer(getrelatedlessonid, (Collection<? extends getTestHeaderTitle>) collection, (Collection<? extends getTestHeaderTitle>) collection2, courseConfigV2CustomModuleQuestionSource, (getOption4) new setAnswerDescription() { // from class: o.getExpiredOn.4
            @Override // kotlin.getOption4
            public final void AudioAttributesCompatParcelizer(getTestHeaderTitle gettestheadertitle) {
                if (gettestheadertitle == null) {
                    read(0);
                }
                getOptions.RemoteActionCompatParcelizer(gettestheadertitle, new getAnswerMap<getTestHeaderTitle, getShowPopup>() { // from class: o.getExpiredOn.4.4
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // kotlin.getAnswerMap
                    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                    public getShowPopup invoke(getTestHeaderTitle gettestheadertitle2) {
                        if (gettestheadertitle2 == null) {
                            read();
                        }
                        getfirstattempttime.write(gettestheadertitle2);
                        return getShowPopup.INSTANCE;
                    }

                    private static /* synthetic */ void read() {
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
                    }
                });
                linkedHashSet.add(gettestheadertitle);
            }

            @Override // kotlin.getOption4
            public final void AudioAttributesCompatParcelizer(getTestHeaderTitle gettestheadertitle, Collection<? extends getTestHeaderTitle> collection3) {
                if (gettestheadertitle == null) {
                    read(3);
                }
                if (collection3 == null) {
                    read(4);
                }
                if (!z || gettestheadertitle.handleMediaPlayPauseIfPendingOnHandler() == getTestHeaderTitle.RemoteActionCompatParcelizer.FAKE_OVERRIDE) {
                    super.AudioAttributesCompatParcelizer(gettestheadertitle, collection3);
                }
            }

            private static /* synthetic */ void read(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "fromSuper";
                } else if (i == 2) {
                    objArr[0] = "fromCurrent";
                } else if (i == 3) {
                    objArr[0] = "member";
                } else if (i != 4) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "overridden";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
                if (i == 1 || i == 2) {
                    objArr[2] = "conflict";
                } else if (i == 3 || i == 4) {
                    objArr[2] = "setOverriddenDescriptors";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.setAnswerDescription
            public final void read(getTestHeaderTitle gettestheadertitle, getTestHeaderTitle gettestheadertitle2) {
                if (gettestheadertitle == null) {
                    read(1);
                }
                if (gettestheadertitle2 == null) {
                    read(2);
                }
            }
        });
        return linkedHashSet;
    }

    public static getMeta RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        if (getrelatedlessonid == null) {
            IconCompatParcelizer(19);
        }
        if (courseConfigV2CustomModuleQuestionSource == null) {
            IconCompatParcelizer(20);
        }
        Collection<CourseConfigV2EditionSwitch> collectionMediaBrowserCompatCustomActionResultReceiver = courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatCustomActionResultReceiver();
        if (collectionMediaBrowserCompatCustomActionResultReceiver.size() != 1) {
            return null;
        }
        for (getMeta getmeta : collectionMediaBrowserCompatCustomActionResultReceiver.iterator().next().aX_()) {
            if (getmeta.aQ_().equals(getrelatedlessonid)) {
                return getmeta;
            }
        }
        return null;
    }

    private static /* synthetic */ void IconCompatParcelizer(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(str2);
        }
    }
}
