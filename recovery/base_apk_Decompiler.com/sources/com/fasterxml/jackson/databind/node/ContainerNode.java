package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.node.ContainerNode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ContainerNode<T extends ContainerNode<T>> extends BaseJsonNode {
    protected final JsonNodeFactory _nodeFactory;

    protected ContainerNode(JsonNodeFactory jsonNodeFactory) {
        this._nodeFactory = jsonNodeFactory;
    }

    protected ContainerNode() {
        this._nodeFactory = null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return "";
    }

    public final BooleanNode booleanNode(boolean z) {
        return this._nodeFactory.booleanNode(z);
    }

    public final NullNode nullNode() {
        return this._nodeFactory.nullNode();
    }

    public final ArrayNode arrayNode() {
        return this._nodeFactory.arrayNode();
    }

    public final ObjectNode objectNode() {
        return this._nodeFactory.objectNode();
    }

    public final TextNode textNode(String str) {
        return this._nodeFactory.textNode(str);
    }
}
