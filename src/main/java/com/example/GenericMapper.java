package com.example;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.mapstruct.Context;
import org.mapstruct.ObjectFactory;
import org.mapstruct.TargetType;

/**
 * Mapper providing shared methods for specializations.
// * @param <E> Entity type.
 */
public abstract class GenericMapper {

    @PersistenceContext
    protected EntityManager em;

    /**
     * @implNote can also use {@link EntityManager#find(java.lang.Class, java.lang.Object)}
     *           proper way is to leave this and catch exception at system boundary (e.g. MVC/JAX-RS exception mapper).
     *           Frameworks like Spring uses this way.
     */
    @ObjectFactory
    public <T> T objectFactory(@TargetType Class<? extends T> clazz, @Context Serializable id) {
        return em.getReference(clazz, id);
    }
}
