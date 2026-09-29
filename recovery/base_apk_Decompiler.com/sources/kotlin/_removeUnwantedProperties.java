package kotlin;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class _removeUnwantedProperties extends _removeUnwantedAccessor {
    _removeUnwantedProperties() {
    }

    @Override // kotlin._removeUnwantedAccessor
    public boolean read(Object obj) {
        return obj instanceof Transition;
    }

    @Override // kotlin._removeUnwantedAccessor
    public Object IconCompatParcelizer(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // kotlin._removeUnwantedAccessor
    public Object RemoteActionCompatParcelizer(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // kotlin._removeUnwantedAccessor
    public void IconCompatParcelizer(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RemoteActionCompatParcelizer(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        AudioAttributesCompatParcelizer(transitionSet, arrayList);
    }

    @Override // kotlin._removeUnwantedAccessor
    public void AudioAttributesCompatParcelizer(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            write(view, rect);
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: o._removeUnwantedProperties.2
                @Override // android.transition.Transition.EpicenterCallback
                public Rect onGetEpicenter(Transition transition) {
                    return rect;
                }
            });
        }
    }

    @Override // kotlin._removeUnwantedAccessor
    public void AudioAttributesCompatParcelizer(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    AudioAttributesCompatParcelizer(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
                return;
            }
            if (IconCompatParcelizer(transition) || !AudioAttributesCompatParcelizer((List) transition.getTargets())) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget(arrayList.get(i));
                i++;
            }
        }
    }

    private static boolean IconCompatParcelizer(Transition transition) {
        return (AudioAttributesCompatParcelizer((List) transition.getTargetIds()) && AudioAttributesCompatParcelizer((List) transition.getTargetNames()) && AudioAttributesCompatParcelizer((List) transition.getTargetTypes())) ? false : true;
    }

    @Override // kotlin._removeUnwantedAccessor
    public Object RemoteActionCompatParcelizer(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // kotlin._removeUnwantedAccessor
    public void read(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: o._removeUnwantedProperties.1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                transition.removeListener(this);
                transition.addListener(this);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    @Override // kotlin._removeUnwantedAccessor
    public Object read(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // kotlin._removeUnwantedAccessor
    public void write(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // kotlin._removeUnwantedAccessor
    public boolean IconCompatParcelizer() {
        FragmentManager.write(4);
        return false;
    }

    @Override // kotlin._removeUnwantedAccessor
    public boolean write(Object obj) {
        if (!FragmentManager.write(2)) {
            return false;
        }
        Objects.toString(obj);
        return false;
    }

    @Override // kotlin._removeUnwantedAccessor
    public void IconCompatParcelizer(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: o._removeUnwantedProperties.5
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                Object obj5 = obj2;
                if (obj5 != null) {
                    _removeUnwantedProperties.this.AudioAttributesCompatParcelizer(obj5, arrayList, null);
                }
                Object obj6 = obj3;
                if (obj6 != null) {
                    _removeUnwantedProperties.this.AudioAttributesCompatParcelizer(obj6, arrayList2, null);
                }
                Object obj7 = obj4;
                if (obj7 != null) {
                    _removeUnwantedProperties.this.AudioAttributesCompatParcelizer(obj7, arrayList3, null);
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
            }
        });
    }

    @Override // kotlin._removeUnwantedAccessor
    public void AudioAttributesCompatParcelizer(Fragment fragment, Object obj, _weirdKey _weirdkey, final Runnable runnable) {
        ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: o._removeUnwantedProperties.4
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                runnable.run();
            }
        });
    }

    @Override // kotlin._removeUnwantedAccessor
    public void IconCompatParcelizer(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            AudioAttributesCompatParcelizer(transitionSet, arrayList, arrayList2);
        }
    }

    public void AudioAttributesCompatParcelizer(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                AudioAttributesCompatParcelizer(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (IconCompatParcelizer(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // kotlin._removeUnwantedAccessor
    public void RemoteActionCompatParcelizer(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // kotlin._removeUnwantedAccessor
    public void read(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: o._removeUnwantedProperties.3
                @Override // android.transition.Transition.EpicenterCallback
                public Rect onGetEpicenter(Transition transition) {
                    Rect rect2 = rect;
                    if (rect2 == null || rect2.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }
}
