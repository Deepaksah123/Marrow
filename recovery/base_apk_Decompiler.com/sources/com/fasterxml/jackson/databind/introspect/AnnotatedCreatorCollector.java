package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class AnnotatedCreatorCollector extends CollectorBase {
    private final boolean _collectAnnotations;
    private AnnotatedConstructor _defaultConstructor;
    private final TypeResolutionContext _typeContext;

    AnnotatedCreatorCollector(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, boolean z) {
        super(annotationIntrospector);
        this._typeContext = typeResolutionContext;
        this._collectAnnotations = z;
    }

    public static AnnotatedClass.Creators collectCreators(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, TypeResolutionContext typeResolutionContext, JavaType javaType, Class<?> cls, boolean z) {
        return new AnnotatedCreatorCollector(annotationIntrospector, typeResolutionContext, z | (cls != null)).collect(typeFactory, javaType, cls);
    }

    final AnnotatedClass.Creators collect(TypeFactory typeFactory, JavaType javaType, Class<?> cls) {
        List<AnnotatedConstructor> list_findPotentialConstructors = _findPotentialConstructors(javaType, cls);
        List<AnnotatedMethod> list_findPotentialFactories = _findPotentialFactories(typeFactory, javaType, cls);
        if (this._collectAnnotations) {
            if (this._defaultConstructor != null && this._intr.hasIgnoreMarker(this._defaultConstructor)) {
                this._defaultConstructor = null;
            }
            int size = list_findPotentialConstructors.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                if (this._intr.hasIgnoreMarker(list_findPotentialConstructors.get(size))) {
                    list_findPotentialConstructors.remove(size);
                }
            }
            int size2 = list_findPotentialFactories.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                if (this._intr.hasIgnoreMarker(list_findPotentialFactories.get(size2))) {
                    list_findPotentialFactories.remove(size2);
                }
            }
        }
        return new AnnotatedClass.Creators(this._defaultConstructor, list_findPotentialConstructors, list_findPotentialFactories);
    }

    private List<AnnotatedConstructor> _findPotentialConstructors(JavaType javaType, Class<?> cls) {
        ClassUtil.Ctor ctor;
        ArrayList arrayList;
        int size;
        List<AnnotatedConstructor> arrayList2;
        if (javaType.isEnumType()) {
            ctor = null;
            arrayList = null;
        } else {
            ctor = null;
            arrayList = null;
            for (ClassUtil.Ctor ctor2 : ClassUtil.getConstructors(javaType.getRawClass())) {
                if (isIncludableConstructor(ctor2.getConstructor())) {
                    if (ctor2.getParamCount() == 0) {
                        ctor = ctor2;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(ctor2);
                    }
                }
            }
        }
        if (arrayList == null) {
            List<AnnotatedConstructor> listEmptyList = Collections.emptyList();
            if (ctor == null) {
                return listEmptyList;
            }
            arrayList2 = listEmptyList;
            size = 0;
        } else {
            size = arrayList.size();
            arrayList2 = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add(null);
            }
        }
        if (cls != null) {
            MemberKey[] memberKeyArr = null;
            for (ClassUtil.Ctor ctor3 : ClassUtil.getConstructors(cls)) {
                if (ctor3.getParamCount() == 0) {
                    if (ctor != null) {
                        this._defaultConstructor = constructDefaultConstructor(ctor, ctor3);
                        ctor = null;
                    }
                } else if (arrayList != null) {
                    if (memberKeyArr == null) {
                        memberKeyArr = new MemberKey[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            memberKeyArr[i2] = new MemberKey(((ClassUtil.Ctor) arrayList.get(i2)).getConstructor());
                        }
                    }
                    MemberKey memberKey = new MemberKey(ctor3.getConstructor());
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        if (memberKey.equals(memberKeyArr[i3])) {
                            arrayList2.set(i3, constructNonDefaultConstructor((ClassUtil.Ctor) arrayList.get(i3), ctor3));
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        if (ctor != null) {
            this._defaultConstructor = constructDefaultConstructor(ctor, null);
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (arrayList2.get(i4) == null) {
                arrayList2.set(i4, constructNonDefaultConstructor((ClassUtil.Ctor) arrayList.get(i4), null));
            }
        }
        return arrayList2;
    }

    private List<AnnotatedMethod> _findPotentialFactories(TypeFactory typeFactory, JavaType javaType, Class<?> cls) {
        ArrayList arrayList = null;
        for (Method method : ClassUtil.getClassMethods(javaType.getRawClass())) {
            if (_isIncludableFactoryMethod(method)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(method);
            }
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        TypeResolutionContext typeResolutionContext = this._typeContext;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        if (cls != null) {
            MemberKey[] memberKeyArr = null;
            for (Method method2 : cls.getDeclaredMethods()) {
                if (_isIncludableFactoryMethod(method2)) {
                    if (memberKeyArr == null) {
                        memberKeyArr = new MemberKey[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            memberKeyArr[i2] = new MemberKey((Method) arrayList.get(i2));
                        }
                    }
                    MemberKey memberKey = new MemberKey(method2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        if (memberKey.equals(memberKeyArr[i3])) {
                            arrayList2.set(i3, constructFactoryCreator((Method) arrayList.get(i3), typeResolutionContext, method2));
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (((AnnotatedMethod) arrayList2.get(i4)) == null) {
                Method method3 = (Method) arrayList.get(i4);
                arrayList2.set(i4, constructFactoryCreator(method3, MethodGenericTypeResolver.narrowMethodTypeParameters(method3, javaType, typeFactory, typeResolutionContext), null));
            }
        }
        return arrayList2;
    }

    private static boolean _isIncludableFactoryMethod(Method method) {
        return Modifier.isStatic(method.getModifiers()) && !method.isSynthetic();
    }

    protected final AnnotatedConstructor constructDefaultConstructor(ClassUtil.Ctor ctor, ClassUtil.Ctor ctor2) {
        return new AnnotatedConstructor(this._typeContext, ctor.getConstructor(), collectAnnotations(ctor, ctor2), NO_ANNOTATION_MAPS);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.fasterxml.jackson.databind.introspect.AnnotatedConstructor constructNonDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil.Ctor r8, com.fasterxml.jackson.databind.util.ClassUtil.Ctor r9) {
        /*
            r7 = this;
            int r0 = r8.getParamCount()
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r7._intr
            if (r1 != 0) goto L1c
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r7 = r7._typeContext
            java.lang.reflect.Constructor r8 = r8.getConstructor()
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r9 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.AnnotationMap r1 = _emptyAnnotationMap()
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r0 = _emptyAnnotationMaps(r0)
            r9.<init>(r7, r8, r1, r0)
            return r9
        L1c:
            if (r0 != 0) goto L30
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r0 = r7._typeContext
            java.lang.reflect.Constructor r1 = r8.getConstructor()
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r2 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.AnnotationMap r7 = r7.collectAnnotations(r8, r9)
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r8 = com.fasterxml.jackson.databind.introspect.AnnotatedCreatorCollector.NO_ANNOTATION_MAPS
            r2.<init>(r0, r1, r7, r8)
            return r2
        L30:
            java.lang.annotation.Annotation[][] r1 = r8.getParameterAnnotations()
            int r2 = r1.length
            r3 = 0
            if (r0 == r2) goto L96
            java.lang.Class r2 = r8.getDeclaringClass()
            boolean r4 = com.fasterxml.jackson.databind.util.ClassUtil.isEnumType(r2)
            r5 = 0
            if (r4 == 0) goto L56
            int r4 = r1.length
            r6 = 2
            int r4 = r4 + r6
            if (r0 != r4) goto L56
            int r2 = r1.length
            int r2 = r2 + r6
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r6, r4)
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r3 = r7.collectAnnotations(r2, r3)
        L54:
            r1 = r2
            goto L72
        L56:
            boolean r2 = r2.isMemberClass()
            if (r2 == 0) goto L72
            int r2 = r1.length
            r4 = 1
            int r2 = r2 + r4
            if (r0 != r2) goto L72
            int r2 = r1.length
            int r2 = r2 + r4
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r6 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r4, r6)
            java.lang.annotation.Annotation[] r1 = com.fasterxml.jackson.databind.introspect.AnnotatedCreatorCollector.NO_ANNOTATIONS
            r2[r5] = r1
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r3 = r7.collectAnnotations(r2, r3)
            goto L54
        L72:
            if (r3 == 0) goto L75
            goto La0
        L75:
            java.lang.Class r7 = r8.getDeclaringClass()
            java.lang.String r7 = r7.getName()
            int r8 = r1.length
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r9, r8}
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations"
            java.lang.String r7 = java.lang.String.format(r9, r7)
            r8.<init>(r7)
            throw r8
        L96:
            if (r9 == 0) goto L9c
            java.lang.annotation.Annotation[][] r3 = r9.getParameterAnnotations()
        L9c:
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r3 = r7.collectAnnotations(r1, r3)
        La0:
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r0 = r7._typeContext
            java.lang.reflect.Constructor r1 = r8.getConstructor()
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r2 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.AnnotationMap r7 = r7.collectAnnotations(r8, r9)
            r2.<init>(r0, r1, r7, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.AnnotatedCreatorCollector.constructNonDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil$Ctor, com.fasterxml.jackson.databind.util.ClassUtil$Ctor):com.fasterxml.jackson.databind.introspect.AnnotatedConstructor");
    }

    protected final AnnotatedMethod constructFactoryCreator(Method method, TypeResolutionContext typeResolutionContext, Method method2) {
        int parameterCount = method.getParameterCount();
        if (this._intr == null) {
            return new AnnotatedMethod(typeResolutionContext, method, _emptyAnnotationMap(), _emptyAnnotationMaps(parameterCount));
        }
        if (parameterCount == 0) {
            return new AnnotatedMethod(typeResolutionContext, method, collectAnnotations(method, method2), NO_ANNOTATION_MAPS);
        }
        return new AnnotatedMethod(typeResolutionContext, method, collectAnnotations(method, method2), collectAnnotations(method.getParameterAnnotations(), method2 == null ? null : method2.getParameterAnnotations()));
    }

    private AnnotationMap[] collectAnnotations(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (this._collectAnnotations) {
            int length = annotationArr.length;
            AnnotationMap[] annotationMapArr = new AnnotationMap[length];
            for (int i = 0; i < length; i++) {
                AnnotationCollector annotationCollectorCollectAnnotations = collectAnnotations(AnnotationCollector.emptyCollector(), annotationArr[i]);
                if (annotationArr2 != null) {
                    annotationCollectorCollectAnnotations = collectAnnotations(annotationCollectorCollectAnnotations, annotationArr2[i]);
                }
                annotationMapArr[i] = annotationCollectorCollectAnnotations.asAnnotationMap();
            }
            return annotationMapArr;
        }
        return NO_ANNOTATION_MAPS;
    }

    private AnnotationMap collectAnnotations(ClassUtil.Ctor ctor, ClassUtil.Ctor ctor2) {
        if (this._collectAnnotations) {
            AnnotationCollector annotationCollectorCollectAnnotations = collectAnnotations(ctor.getDeclaredAnnotations());
            if (ctor2 != null) {
                annotationCollectorCollectAnnotations = collectAnnotations(annotationCollectorCollectAnnotations, ctor2.getDeclaredAnnotations());
            }
            return annotationCollectorCollectAnnotations.asAnnotationMap();
        }
        return _emptyAnnotationMap();
    }

    private final AnnotationMap collectAnnotations(AnnotatedElement annotatedElement, AnnotatedElement annotatedElement2) {
        AnnotationCollector annotationCollectorCollectAnnotations = collectAnnotations(annotatedElement.getDeclaredAnnotations());
        if (annotatedElement2 != null) {
            annotationCollectorCollectAnnotations = collectAnnotations(annotationCollectorCollectAnnotations, annotatedElement2.getDeclaredAnnotations());
        }
        return annotationCollectorCollectAnnotations.asAnnotationMap();
    }

    private static boolean isIncludableConstructor(Constructor<?> constructor) {
        return !constructor.isSynthetic();
    }
}
